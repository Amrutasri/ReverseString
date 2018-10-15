class ReverseString {

    String reverse(String inputString) {
        StringBuilder reverseString = new StringBuilder("");
        int lengthOfString = inputString.length();
        if (lengthOfString == 0) {
            return inputString;
        } else {
            for (int index = lengthOfString-1; index >= 0; index--) {
                reverseString.append(inputString.charAt(index));
            }
            return reverseString.toString();
        }
    }
}