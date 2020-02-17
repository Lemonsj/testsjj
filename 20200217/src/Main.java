/*
public class Main {

    // 子问题思路-求叶子结点个数
    int getLeafSize2(TreeNode root) {
        if (root == null) {
            return 0;
        } else if (root.left == null && root.right == null) {
            return 1;
        }
        return getLeafSize2(root.left)
                + getLeafSize2(root.right);
    }

    // 遍历思路-求叶子结点个数
    static int leafSize = 0;

    void getLeafSize1(TreeNode root) {
        if (root == null) {
            return;
        } else if (root.left == null && root.right == null) {
            leafSize++;
        }
        getLeafSize1(root.left);
        getLeafSize1(root.right);
    }

    int getKLevelSize(TreeNode root, int k) {
        if (root == null) {
            return 0;
        }
        if (k == 1) {
            return 1;
        }
        return getKLevelSize(root.left, k - 1) +
                getKLevelSize(root.right, k - 1);
    }

    //前序遍历的形式去查找
    TreeNode find(TreeNode root, int val) {
        if (root == null) {
            return null;
        }
        if (root.value == val) {
            return root;
        }

        TreeNode ret = find(root.left, val);
        if (ret != null) {
            return ret;
        }
        ret = find(root.right, val);
        if (ret != null) {
            return ret;
        }
        return null;
    }

    public void binaryTreePrevOrderNonR(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while (cur != null || !stack.empty()) {
            while (cur != null) {
                stack.push(cur);
                System.out.print(cur.value + " ");
                cur = cur.left;
            }
            TreeNode top = stack.pop();
            cur = top.right;
        }
    }

    public void binaryTreeInOrderNonR(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while (cur != null || !stack.empty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            TreeNode top = stack.pop();
            System.out.print(top.value + " ");
            cur = top.right;
        }
    }

    public void binaryTreePostOrderNonR(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        TreeNode prev = null;
        while (cur != null || !stack.empty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.peek();
            if (cur.right == null || cur.right == prev) {
                stack.pop();
                System.out.print(cur.value + " ");
                prev = cur;
                cur = null;
            } else {
                cur = cur.right;
            }
        }
    }

    public void binaryTreeLevelOrder1(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        if(root != null) {
            queue.offer(root);
        }
        while (!queue.isEmpty()) {
            TreeNode cur = queue.poll();
            System.out.print(cur.value+" ");
            if(cur.left != null) {
                queue.offer(cur.left);
            }
            if(cur.right != null) {
                queue.offer(cur.right);
            }
        }
    }
    public List<List<Character>> binaryTreeLevelOrder2(TreeNode root) {
        List<List<Character>> ret = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root != null) {
            queue.offer(root);
        }
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Character> list = new ArrayList<>();
            while (size > 0) {
                TreeNode cur = queue.poll();
                System.out.print(cur.value+" ");
                list.add(cur.value);
                if(cur.left != null) {
                    queue.offer(cur.left);
                }
                if(cur.right != null) {
                    queue.offer(cur.right);
                }
                size--;
            }
            ret.add(list);
        }
        return ret;
    }
    // 层序遍历
    void levelOrderTraversal(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        if(root != null) {
            queue.offer(root);
        }
        while (!queue.isEmpty()) {
            TreeNode cur = queue.poll();
            System.out.print(cur.value+" ");
            if(cur.left != null) {
                queue.offer(cur.left);
            }
            if(cur.right != null) {
                queue.offer(cur.right);
            }
        }
    }

    public List<List<Character>> levelOrder2(TreeNode root) {
        List<List<Character>> ret = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root != null) {
            queue.offer(root);
        }
        while (!queue.isEmpty()) {
            int size = queue.size();//4
            List<Character> list = new ArrayList<>();
            while (size > 0) {
                TreeNode cur = queue.poll();
                System.out.print(cur.value+" ");
                list.add(cur.value);
                size--;//0
                if(cur.left != null) {
                    queue.offer(cur.left);
                }
                if(cur.right != null) {
                    queue.offer(cur.right);
                }
            }
            ret.add(list);
        }
        return ret;
    }

}
}
*/
