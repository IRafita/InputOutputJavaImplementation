loli:
	mkdir tmp;
	mv b/*.pdf tmp;
	rm -rf b;
	mkdir b;
	mv tmp/*.pdf b;
	rm -rf tmp;
	clear;
	cd b; latex ../src/*.tex; latex ../src/*.tex; pdflatex ../src/tree.tex; dvipdf *.dvi;
