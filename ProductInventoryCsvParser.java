public class ProductInventoryCsvParser {
    static void parseInventoryRecord(String line){String[] f=line.split(",",-1);if(f.length!=3){System.out.println("Invalid Record");return;}System.out.printf("Product: %s | SKU: %s | Qty: %s%n",f[0].trim(),f[1].trim(),f[2].trim());}
    public static void main(String[] args){parseInventoryRecord("Wireless Mouse,WM-2201,150");}
}
