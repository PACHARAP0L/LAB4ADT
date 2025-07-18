
public class IntegerSetTest {
    public static void main(String[] args) {
        int passed = 0;
        int failed = 0;

        IntegerSet a = new IntegerSet();
        a.add(50);a.add(60);a.add(70);
        String s = "[50, 60, 70]";
        if (a.toString().equals(s)) {
            System.out.println("Pass");
            passed++;
        }
        else{
            System.out.println("Fail "+ a.toString());failed++;
        }
        
        //test 2 ข้อมูลซ้ำ
        IntegerSet b = new IntegerSet();
        b.add(50);b.add(50);
        String s1 = "[50]";
        if (b.toString().equals(s1)) {
            System.out.println("Pass");
            passed++;
        }
        else{
            System.out.println("Fail "+ b.toString()); failed++;
        }

        //test 3  

        
        // --- สรุปผล ---
        System.out.println("\n--------------------");
        System.out.println("--- Test Summary ---");
        System.out.println("Passed: " + passed + ", Failed: " + failed);
        if (failed == 0) {
            System.out.println("Excellent! All tests passed!");
        } else {
            System.out.println("Some tests failed.");
        }

    }
}