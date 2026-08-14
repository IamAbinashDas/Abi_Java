public class patterns {

    public static void hollow_rec(int row,int col){

        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                if(i==1||j==1||i==row||j==col){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void inverted_rot_half_py(int row){

        for(int i=1;i<=row;i++){
            //spaces
            for(int j=1;j<=row-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
    public static void inverted_half_py_num(int row){

        for(int i=1;i<=row;i++){
            for(int j=1;j<=row-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void floyd_triangle(int row){
        int count=1;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
    public static void z_o_triangle(int row){
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    public static void butterfly(int n){
        //1st half
        for(int i=1;i<=n;i++){
            //stars=i
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces=2*(n-i)
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //stars=i
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //2nd half
        for(int i=n;i>=1;i--){
            //stars=i
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces=2*(n-i)
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //stars=i
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void solid_rhombus(int n){

        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=n;j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
    public static void hollow_rhombus(int n){

        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=n;j++){
                if(i==1||i==n||j==1||j==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void diamond(int n){

        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=2*i-1;j++){
                System.out.print('*');
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=2*i-1;j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public static void diamondNum(int n){
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //nums
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //nums
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        
       /*  for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
            int n=7;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        int num=4;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println();
        int a=4;
        char ch='A';
        for(int i=1;i<=a;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }*/
        // hollow_rec(10,7);
        // inverted_rot_half_py(4);
        // inverted_half_py_num(5);
        // floyd_triangle(5);
        // z_o_triangle(5);
        // butterfly(4);
        // solid_rhombus(5);
        // hollow_rhombus(5);
        // diamond(4);
        diamondNum(5);  


        
        // int n=4;
        // for(int i=1;i<=n;i++){
        //     //spaces
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     //stars
        //     for(int j=1;j<=2*i-1;j++){
        //         System.out.print('*');
        //     }
        //     System.out.println();
        // }
        // for(int i=n;i>=1;i--){
        //     //spaces
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     //stars
        //     for(int j=1;j<=2*i-1;j++){
        //         System.out.print('*');
        //     }
        //     System.out.println();
        // }


    }
}     