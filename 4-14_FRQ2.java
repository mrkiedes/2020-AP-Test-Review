// Part A
public int countElectronicsByMaker(String maker)
{
  int result = 0;
  for (int i = 0; i < purchases.size(); i++) {
    if (purchases.get(i).getMaker().equals(maker) && purchases.get(i).isElectronic()){
      result++;
    }
  }
  return result;
}

// Part B
public boolean hasAdjacentEqualPair()
{
  Gizmo g1 = purchases.get(0);
  for (int pos = 1; pos < purchases.size(); pos++){
    Gizmo g2 = purchases.get(pos);
    if (g1.equals(g2)){
      return true;
    }
    g1 = g2;
  }
  return false;
}
