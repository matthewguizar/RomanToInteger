class RomanToInteger {
    
    public int romantToInt(String numeral){
        //keeping track of answer and numeral by each character
        int answer = 0;
        int num = 0;

        /*loop runs backwards and length of numeral input but subtracted by 1 to get each character
        roman numerals are usually in ascending order, if not the smaller number is subtracted
        example IV (THE ONE is SUBTRACTED FROM THE V)
        */
        for (int i = numeral.length()-1; i>=0; i--){
            //checking last character and using switch statement to get value and store in num variable
            switch(numeral.charAt(i)) {
                case 'I': num =1; break;
                case 'V': num =5; break;
                case 'X': num =10; break;
                case 'L': num =50; break;
                case 'C': num =100; break;
                case 'D': num =500; break;
                case 'M': num =1000; break;
            }
            /*
            the first num is always bigger than the answer and so if part is skipped
            and value from switch statement is added to answer varible
            After the second time, its comparing if the value before is bigger than
            the following, if so then it is they are subtracted
             */
            if (4 * num < answer) {
                answer -= num;
            } else {
                answer += num;
            }
        }
        return answer;
    }
}