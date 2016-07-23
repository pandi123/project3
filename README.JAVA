public String longestCommonPrefix(String[] a) {
    String longestPrefix = "";
    if(a.length>0){
        longestPrefix = a[0];
    }
    for(int i=1; i<a.length; i++){
        String analyzing = a[i];
        int j=0;
        for(; j<Math.min(longestPrefix.length(), a[i].length()); j++){
            if(longestPrefix.charAt(j) != analyzing.charAt(j)){
                break;
            }
        }
        longestPrefix = a[i].substring(0, j);
    }
    return longestPrefix;
}
