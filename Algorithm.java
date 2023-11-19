public class Algorithm {
    public boolean contains(String x, String y) {
        if (x.indexOf(y) > -1) {
            return true;
        }
        return false;
    }

    public String reverse(String x) {
        String answer = "";
        for (int i = 0; i < x.length(); i++) {
            answer += x.substring(x.length() - i - 1, x.length() - i);
        }
        return answer;
    }

    public boolean palindrome(String x) {
        int index = 0;
        for (int i = 0; i < x.length() / 2; i++) {
            if (x.substring(i, i + 1).equals(x.substring(x.length() - 1 - i, x.length() - i))) {
                index++;
            }
        }
        if (index == (x.length() / 2)) {
            return true;
        }
        return false;
    }

    public int occurence(String x, String y) {
        if(x.contains(y)){
            int index=0;
            int times=0;
            String newString=x;
            while(newString.contains(y)) {
                index = newString.indexOf(y);
                newString=x.substring(index+1);
                times++;
            }
            return times;
        }
        else {
            return 0;
        }
    }
}

