public class StringPalindrome {

    public boolean isPalindrome(String str){
        StringBuffer stringBuffer=new StringBuffer(str);


        int startIndex=0;
        int endIndex= str.length()-1;
        boolean isEqual=true;
        for(int i=0;i<=(str.length()/2);i++){
            if(stringBuffer.charAt(startIndex)==stringBuffer.charAt(endIndex)){
                startIndex++;
                endIndex--;
            }else{
                isEqual=false;
                break;
            }
        }
        return isEqual;
    }

    public static void main(String[] args) {
        StringPalindrome stringPalindrome=new StringPalindrome();

        System.out.println(stringPalindrome.isPalindrome("malayalam"));
    }
}
