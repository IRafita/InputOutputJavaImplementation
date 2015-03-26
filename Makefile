lola:
	clear
	javac src/main.java -d b;

run:
	clear;
	cd b; java src.main;

clear:
	rm -rf b;

doc:
	clear;
	echo 'javadoc -d b **/*.java';
	echo 'make web';

web:
	firefox b/index.html;
