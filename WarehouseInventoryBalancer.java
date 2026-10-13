public class WarehouseInventoryBalancer {
    static void analyzeInventory(int[] a, int[] b) {
        int ta=0,tb=0; for(int x:a)ta+=x; for(int x:b)tb+=x;
        int max=Integer.MIN_VALUE, section=0,index=-1;
        for(int i=0;i<a.length;i++) if(a[i]>max){max=a[i];section=1;index=i;}
        for(int i=0;i<b.length;i++) if(b[i]>max){max=b[i];section=2;index=i;}
        System.out.printf("Section A Total: %d | Section B Total: %d | Status: %s | Highest: %d in Section %s at index %d%n",ta,tb,ta==tb?"Balanced":"Not Balanced",max,section==1?"A":"B",index);
    }
    public static void main(String[] args) { analyzeInventory(new int[]{20,15,30},new int[]{25,10,30}); }
}
