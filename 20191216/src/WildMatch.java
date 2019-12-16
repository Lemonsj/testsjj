public class WildMatch {
        public boolean chkWildMatch(String A, int lena, String B, int lenb) {
            // write code here

            //return isP(A,0,B,0);
            return ispForDp(A,B);
        }
        //递归转dp
        public  boolean ispForDp(String A,String B){
            int n = A.length();
            int m = B.length();
            boolean dp[][] = new boolean[m+2][n+1];
            dp[m][n]=true;

            for(int i=m-1;i>=0;--i){
                for(int j=n-1;j>=0;--j){

                    if(B.charAt(i)=='*'){

                        dp[i-1][j]=dp[i-1][j+1]|dp[i+1][j+1];
                        if(j==0)
                            --i;
                    }else if(A.charAt(j)==B.charAt(i)||B.charAt(i)=='.'){

                        dp[i][j]=dp[i+1][j+1];
                    }else{
                        dp[i][j]=false;
                    }

                }

            }

            return dp[0][0];

        }

        //ia为A当前索引位置，ib为B当前索引位置,函数返回值为到当前位置是否匹配
        //结束且结果为true或false
        public  boolean isP(String A,int ia,String B,int ib){
            //当A匹配结束且B结束返回true
            if(ia==A.length()&&ib==B.length())
                return true;
            //边界控制,超出返回false
            if(ib>=B.length()||ia>=A.length())
                return false;

            //当A[ia]!=B[ib]且B[ib]!='.'时返回false
            if(A.charAt(ia)!=B.charAt(ib)&&B.charAt(ib)!='.')
                return false;


            boolean isp = false;

            //B的ib下一个是*时
            if((ib+1<B.length())&&B.charAt(ib+1)=='*'){
                //选用*的功能，ib索引位置不变，ia+1进行匹配
                boolean is1 = isP(A,ia+1,B,ib);
                //不选用*的功能,ib跳到'*'后一个位置ib+2，ia+1进行匹配
                boolean is2 = isP(A,ia+1,B,ib+2);

                isp = is1|is2;
            }else{//下一个不是*时，直接进行下一个匹配

                isp = isP(A,ia+1,B,ib+1);
            }

            return isp;
        }

}
