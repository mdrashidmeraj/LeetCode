class Solution {
    public boolean backspaceCompare(String s, String t) {
        String us = "";
        String ut = "";
        for(int i = 0;i<s.length();i++){
            if(us.length()>0 &&s.charAt(i) == '#') us = us.substring(0, us.length()-1);
            else if(s.charAt(i) != '#')us+=s.charAt(i);
        }
        for(int i = 0;i<t.length();i++){
            if(ut.length()>0 && t.charAt(i) == '#')ut = ut.substring(0, ut.length()-1);
            else if(t.charAt(i) != '#')ut+=t.charAt(i);
        }
        System.out.println(us);
                System.out.println(ut);

        return us.equals(ut);
    }
}