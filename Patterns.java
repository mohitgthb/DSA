class Patterns {

    void pattern1(){
         for(int i = 0; i<5; i++){
            for(int j = 0; j<5; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    void pattern2(){
        for(int i=0; i<5; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    void pattern3(){
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

      void pattern4(){
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    void pattern5(){
        for(int i=5; i>0; i--){
            for(int j=0; j<i; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    void pattern6(){
        for(int i=5; i>0; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    void pattern7(int N){
        for(int i=0; i<N; i++){
            for(int j=0; j< N-i-1; j++){
                System.out.print( "  ");
            }

            for(int j=0; j<2*i + 1; j++){
                System.out.print("*" + " ");
            }

            for(int j=0; j< N-i-1; j++){
                System.out.print( "  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    void pattern8(int N){
        for(int i=0; i<N; i++){
            for(int j=0; j<i; j++){
                System.out.print( "  ");
            }

            for(int j=0; j<2*N - (2*i + 1); j++){
                System.out.print("*" + " ");
            }

            for(int j=0; j< i; j++){
                System.out.print( "  ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        
        Patterns obj = new Patterns();

        obj.pattern8(5);
    }
}