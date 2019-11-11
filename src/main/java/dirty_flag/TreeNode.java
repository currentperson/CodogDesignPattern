package dirty_flag;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class TreeNode<T> {
    private T value;
    private List<TreeNode<T>> children = new ArrayList<>();

    public TreeNode(T value) {
        this.value = value;
    }
}
