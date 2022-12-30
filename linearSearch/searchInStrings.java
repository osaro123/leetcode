public class searchInStrings {
    public static void main(String[] args) {
        String name = "osaro";
        char target = 'a';
    }
    
    static boolean search(String name, char target){
        for(int i=0; i < name.length(); i++){
            if(name.charAt(i) == target){
                return true;
            }
        }
        return false;
    }
}
