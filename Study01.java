public class Study01 {
    public static void main(String[] args) throws Exception {
        String s = "(()(";
        boolean result = true;

        char arr[] = new char[s.length()];

        for(int i=0; i<arr.length;i++){
            arr[i] = s.charAt(i);
        }

        int cnt = 0; 

        for(int i=0;i<arr.length;i++){
            if(arr[0]==')'||arr[arr.length-1]=='('){
                result = false;
                break;
            }
            else if(arr[i]=='('){
                cnt++;
            }
            else{
                cnt--;
            }
            if(cnt==0){
            result = true;
            }
            else{
                result = false;
            }
        }
        
        System.out.println(result);
    }
}
