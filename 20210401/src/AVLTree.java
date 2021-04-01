/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2021-04-01
 * Time: 18:17
 **/
public class AVLTree {
    private Node root = null;

    private void insert(int key) {
        if(root == null) {
            //空树的插入，单独处理即可
            root = new Node (key,null);
            return;
        }

        Node parent = null;
        Node cur = root;
        while(cur != null) {
            if(key == cur.key) {
                throw new RuntimeException("key("+key+")已经重复了");
            }else if(key < cur.key) {
                parent = cur;
                cur = cur.left;
            }else {
                parent = cur;
                cur = cur.right;
            }
        }

        //直到找到null的位置，才真正开始插入
        if(key < parent.key) {
            cur = parent.left = new Node(key,parent);
        }else {
            //这里只能是key > parent.key，因为如果相等，上面循环就已经抛异常了
            cur = parent.right = new Node(key,parent);
        }



        //上面的过程是，正常搜索树的插入过程
        //parent是要调整BF的结点
        //cur是破坏源所在的节点

        while(true) {

            //根据情况，更新平衡因子
            if(cur == parent.left) {
                parent.bf++;
            }else {
                //cur == parent.right;
                parent.bf--;
            }


            //分情况处理
            if(parent.bf == 0) {
                break;
            }else if(parent.bf == 2) {
                //进行失衡的修复
                //左左失衡OR左右失衡
                if(cur.bf == 1) {
                    //左左失衡
                    fixLeftLeftLoseBalance(parent);
                }else {
                    //左右失衡
                    fixLeftRightLoseBalance(parent);
                }
                break;
            }else if(parent.bf == -2) {
                //进行失衡的修复
                //右右失衡OR右左失衡
                if(cur.bf == -1) {
                    //右右失衡
                    fixRightRightLoseBalance(parent);
                }else {
                    //右左失衡
                    fixRightleftLoseBalance(parent);
                }
                break;
            }else if(parent == root) {
                break;
            }


            //如果需要继续
            Node parentOfParent = parent.parent;
            cur = parent;
            parent = parentOfParent;
        }

    }

    private void leftRotate(Node parent) {
        //如果前面实现都正确，并且已经走到这个位置是，说明parent一定不是null
        //并且parent.right也一定不是null

        Node parentOfParent = parent.parent;
        Node right = parent.right;
        Node leftOfRight = right.left;

        right.parent = parentOfParent;

        //需要明确原来parent是parentOfParent的左还是右
        if(parentOfParent == null) {
            //原来的根是parent
            //现在的根是right
            root = right;
        }else if(parent == parentOfParent.left) {
            parentOfParent.left = right;
        }else {
            parentOfParent.right = right;
        }

        right.left = parent;
        parent.parent = right;

        parent.right = leftOfRight;
        if(leftOfRight != null) {
            leftOfRight.parent = parent;
        }
    }

    private void rightRotate(Node parent) {
        Node parentOfParent = parent.parent;
        Node left = parent.left;
        Node rightOfLeft = left.right;

        left.parent = parentOfParent;
        if(parentOfParent == null) {
            root = null;
        }else if(parent == parentOfParent.left) {
            parentOfParent.left = left;
        }else {
            parentOfParent.right = left;
        }

        left.right = parent;
        parent.parent = left;

        parent.left = rightOfLeft;
        if(rightOfLeft != null) {
            rightOfLeft.parent = parent;
        }
    }

    private void fixLeftLeftLoseBalance(Node parent) {
         Node node = parent;
         Node leftOfNode = parent.left;

         //左左失衡，对失衡结点右旋
         rightRotate(parent);

         //根据计算的结果，更新BF
        node.bf = leftOfNode.bf = 0;
    }

    private void fixLeftRightLoseBalance(Node parent) {
        Node node = parent;
        Node leftOfNode = parent.left;
        Node rightOfLeftOfNode = leftOfNode.right;

        leftRotate(leftOfNode);
        rightRotate(parent);

        if(rightOfLeftOfNode.bf == 1) {
            node.bf = -1;
            leftOfNode.bf = 0;
            rightOfLeftOfNode.bf = 0;
        }else if(rightOfLeftOfNode.bf == -1) {
            node.bf = 0;
            leftOfNode.bf = 1;
            rightOfLeftOfNode.bf = 0;
        }else {
            node.bf = leftOfNode.bf = rightOfLeftOfNode.bf = 0;
        }
    }

    private void fixRightRightLoseBalance(Node parent) {
        Node rightOfNode = parent.right;
        leftRotate(parent);

        parent.bf = rightOfNode.bf = 0;
    }

    private void fixRightleftLoseBalance(Node parent) {
        Node rightOfNode = parent.right;
        Node leftOfRightNode = rightOfNode.left;

        rightRotate(rightOfNode);
        leftRotate(parent);


        if(leftOfRightNode.bf == -1) {
            parent.bf = 1;
            rightOfNode.bf = leftOfRightNode.bf = 0;
        }else if(leftOfRightNode.bf == 1) {
            rightOfNode.bf = -1;
            parent.bf = leftOfRightNode.bf = 0;
        }else{
            parent.bf = rightOfNode.bf = leftOfRightNode.bf = 0;
        }

    }

    private boolean contains(int key) {
        Node cur = root;
        while(cur != null) {
            if(key == cur.key) {
                return true;
            }else if(key < cur.key) {
                cur = cur.left;
            }else {
                cur = cur.right;
            }
        }

        return false;
    }
}
