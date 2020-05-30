package mutex.better;

import com.google.common.base.Preconditions;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.recipes.locks.InterProcessLock;
import org.apache.curator.framework.recipes.locks.InterProcessMutex;

import java.util.concurrent.TimeUnit;

/**
 * @author : wangwenhan
 * @since : 2020/5/29
 */

public class LockExecuteTemplate {

    private CuratorFramework lockClient;

    public void handLockProcess(LockCallback lockCallback, BusinessTypeLockEnum businessTypeLockEnum, String uuid) {
        InterProcessLock lock = new InterProcessMutex(lockClient, "/hermes/" + businessTypeLockEnum + uuid);
        try {
            Preconditions.checkArgument(lock.acquire(2000, TimeUnit.SECONDS));
        } catch (Exception e) {
            throw new RuntimeException("acquire lock failed", e);
        }
        try {
            boolean isRightStatus = lockCallback.checkStatus(uuid);
            if(isRightStatus) {
                lockCallback.execute();
            }
        } catch (Exception e) {
            throw new RuntimeException("execute lock failed", e);
        } finally {
            try {
                lock.release();
            } catch (Exception e) {
                throw new RuntimeException("release lock failed", e);
            }
        }
    }
}
