class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = "";
        for(int i=0; i < strs[0].length() ; i++) {
            boolean isCommon = true;
            for(int j=1; j < strs.length; j++) {
                if(strs[j].length() == i || strs[j].charAt(i) != strs[0].charAt(i)){
                    isCommon = false;
                    break;
                }
            }
            if(isCommon == false) break;
            // NOTE : char can be concatenated - https://linuxhint.com/add-char-to-string-in-java/
            prefix += strs[0].charAt(i);
        }
        return prefix;
    }
}