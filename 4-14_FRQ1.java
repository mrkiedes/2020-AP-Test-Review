// Part A
public static boolean isSelfDivisor(int number){
  int n = number;
  while (n > 0) {
    int digit = n % 10;
    if(digit == 0 || number % digit != 0){
      return false;
    }
    n /= 10;
  }
  return true;
}

// Part B
public static int[] firstNumSelfDivisors (int start, int num){
  int[] self = new int[num];
  int numStored = 0;
  int nextNumber = start;
  while(numStored < num){
    if(isSelfDivisor(nextNumber)){
      selfs[numStored] = nextNumber;
      numStored++;
    }
    nextNumber++;
  }
  return selfs;
}
