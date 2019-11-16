package dirty_flag;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class EmployeeAgeService {

    public static Integer queryEmployeeAvgAge(TreeNode<String> employeeUserTree) {
        if(!Constant.IS_EMPLOYEE_CHANGED) {
            return Constant.LASTDAY_EMPLOYEE_AVG_AGE;
        }
        Integer totalAge = 0;
        Integer employeeCount = 0;
        if (employeeUserTree == null) {
            System.out.println("公司倒闭了");
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(employeeUserTree);
        while (!queue.isEmpty()) {
            TreeNode<String> node = queue.poll();
            totalAge += EmployeeWebService.queryEmployeeAge(node.getValue());
            employeeCount++;
            for (TreeNode<String> child : node.getChildren()) {
                queue.offer(child);
            }
        }
        int age = totalAge / employeeCount;
        Constant.LASTDAY_EMPLOYEE_AVG_AGE = age;
        return age;
    }

    public static void main(String[] args) {
        TreeNode<String> root = new TreeNode<String>("0");
        TreeNode<String> stringTreeNode = new TreeNode<>("1");
        stringTreeNode.setChildren(Arrays.asList(new TreeNode<>("4"), new TreeNode<>("5"), new TreeNode<>("6")));
        root.setChildren(Arrays.asList(stringTreeNode, new TreeNode<>("2"), new TreeNode<>("3")));
        System.out.println(queryEmployeeAvgAge(root));
    }
}
