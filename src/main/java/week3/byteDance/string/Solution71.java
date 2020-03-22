package week3.byteDance.string;

/**
 * @author: jia.xue
 * @create: 2020-03-22 13:08
 * @Description
 **/
class Solution71 {
    public String simplifyPath(String path) {
        if (path == null || path.length() <=0) return path;
        String[] arr = path.split("/");
        StringBuilder sb = new StringBuilder();
        String lastStr = "";
        for (int i = 0;i< arr.length;i++){
            String cruStr = arr[i];
            if (arr[i] == "" || arr[i].length()==0) continue;
            else if (".".equals(arr[i])) continue;
            else if ("..".equals(arr[i])) {
                if (sb.toString().length() > 1) {
                    sb = new StringBuilder(sb.substring(0,(sb.toString().length()-lastStr.length())<1 ? 0:(sb.toString().length()-lastStr.length())));
                }
            }
            else{
                sb.append("/").append(arr[i]);
                lastStr = "/" + arr[i];
            }
        }
        if (sb.toString().length()<=0) {
            return "/";
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution71 solution71 = new Solution71();
        String path = solution71.simplifyPath("/mYedp/lui/./IS/dpDJF/../A/..///..///..//");
        System.out.println(path);
    }
}