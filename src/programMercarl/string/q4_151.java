package programMercarl.string;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/10/17 下午3:06
 */
public class q4_151 {
    public String reverseWords(String s) {
        String reverseString = removeSpace(s);
        reverseString = reverse(reverseString);
        String[] strings = reverseString.split(" ");
        for(int i=0;i<strings.length;i++){
            strings[i]=reverse(strings[i]);
        }
        StringBuilder sb =new StringBuilder();
        sb.append(strings[0]);
        for(int i=1;i<strings.length;i++){
            sb.append(" ");
            sb.append(strings[i]);
        }
        return new String(sb);
    }

    public String removeSpace(String s){
        StringBuilder sb =new StringBuilder();
        int start = 0;
        int end = s.length()-1;
        while(s.charAt(start) == ' ')
            start++;
        while(s.charAt(end)==' ')
            end--;
        while (start <= end){
            char c = s.charAt(start);
            if(c != ' ' || sb.charAt(sb.length()-1)!= ' '){
                sb.append(c);
            }
            start++;
        }
        return sb.toString();
    }
    public String reverse(String s){
        char[] chars=s.toCharArray();
        int left=0,right=chars.length-1;
        while(left<right){
            char tmp = chars[left];
            chars[left] = chars[right];
            chars[right]=tmp;
            left++;
            right--;
        }
        return new String(chars);
    }
}
