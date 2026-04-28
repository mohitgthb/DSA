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
    public static void main(String[] args) {
        
        Patterns obj = new Patterns();

        obj.pattern1();
        obj.pattern2();
    }
}