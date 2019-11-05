package co.bibleit.delegation;

// demonstrates deligation.
// deligate responsibiliy from a printer class to a class that does the printing.
// printer is more generic - the delegator
// the delegate itself will be a real printer.
// the main class will use the printer object

class RealPrinter{
    // the delegate
    void print(){
        System.out.println("The Delegate");
    }
}

class Printer {
    // the delegator
    RealPrinter p = new RealPrinter();

     // create the delegate
    void print(){
        p.print();  // delegation
    }
}

// The tester class knows nothing about the Real Printer
class Tester {
    // to the outside world it looks like the printer is actually printing.
    public static void  main(String[] args){
        Printer printer = new Printer();
        printer.print();
    }
}