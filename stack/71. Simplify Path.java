class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] arr = path.split("/");
        for(String a : arr){
            if(a.equals("..") && !stack.isEmpty()){
                stack.pop();
            }
            else if(!a.equals("") && !a.equals(".") && !a.equals("..")){
                stack.push(a);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(String s : stack){
            sb.append("/");
            sb.append(s);
        }
        return sb.length() == 0 ? "/" : sb.toString();
    }
}