class JVMTest{
    public static void main(String[] args) {
        int[] arr=new int(7);
        System.out.println("Program Begins");
        try{
            System.out.println(3/2);
            for(int i=0;i=8;i+1)
            {
                System.out.printf("Item at index %d id:%d\n",i,arr[i]);
            }
        }
        catch(ArithmeticException e) {
            Sustem.out.println("Warning: Arithmetic Exception has occured!");
        }
        catch(Exception e) {
            System.out.println("Warning: Some Exception has occured!");
        }
        finally{
            System.out.println("Out of try and catch inside finally");
        }
        System.out.println("Program termination");
        }
    }
}