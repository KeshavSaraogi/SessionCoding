package PackageTwo;

import packageOne.PackageOneSample;

public class PackageTwoTest extends PackageOneSample{

	public static void main(String[] args) {
		PackageOneSample pos = new PackageOneSample();
		pos.methodOne();
		
		PackageTwoTest ptt = new PackageTwoTest();
		ptt.methodOne();
		ptt.methodTwo();
	}
}
