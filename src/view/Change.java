package view;

public class Change {
    public static void main(String[] args) {
        String image="ghf\bgh\bhgfv";
        String[] arr=new String[image.length()];
        String updatedImage="";
        for(int i=0;i<=image.length()-1;i++){
            if(image.charAt(i)=='\b'){
                arr[i]="/";
            }else{
              arr[i]=String.valueOf(image.charAt(i));
            }
            updatedImage+=arr[i];
        }
         System.out.println(updatedImage);
       
    }
}