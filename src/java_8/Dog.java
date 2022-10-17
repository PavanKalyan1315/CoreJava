package java_8;

public interface Dog {
void bark();
static void eat() {
	System.out.println("eating peddigree");
}
default void sleep() {
	System.out.println("sleep 12 hr daily");
}
}
