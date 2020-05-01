package main;

public class StringToInteger {

  public static int atoi(String str) {
    double num = 0;
    char fc = ' '; //Assume first char is whitespace
    for(char c : str.toCharArray()){
      if(fc == ' '){
        if(c != ' '){
          fc = c; //update first char if not whitespace
          if(Character.isDigit(c)){
            num = (c-'0');
          }
        }
      }else if(fc == '+' || fc == '-' || Character.isDigit(fc)){
        if(Character.isDigit(c)){
          num = (num*10) + (c-'0');
        }else{
          break;
        }
      }
    }
    if (fc == '-') {
      num *= -1;
      num = num < Integer.MIN_VALUE ? Integer.MIN_VALUE : num;
    } else {
      num = num > Integer.MAX_VALUE ? Integer.MAX_VALUE : num;
    }
    // Cast to int to return
    return (int)num;
  }

}