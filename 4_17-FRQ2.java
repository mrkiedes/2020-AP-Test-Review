// Part A
public ArrayList<String> getDelimitersList(String[] tokens)
{
  ArrayList<String> d = new ArrayList<String>();
  for (String str : tokens){
    if (str.equals(openDel) || str.equals(closeDel)){
      d.add(str);
    }
  }
  return d;
}

// Part break;
public boolean isBalanced(ArrayList<String> delimiters)
{
  int openCount = 0;
  int closeCount = 0;
  for (String str : delimiters){
    if (str.equals(openDel)){
      openCount++;
    }else{
      closeCount++;
    }
    if (closeCount > openCount){
      return false;
    }
  }
  if (openCount == closeCount){
    return true;
  }else{
    return false;
  }
}
