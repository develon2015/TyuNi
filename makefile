.PHONY: all
all: bin/MainKt.class

bin/MainKt.class: $(wildcard *.kt) | bin
	kc -cp bin -d bin $^

bin:
	mkdir bin

.PHONY: run
run: 
	@jk -cp bin MainKt

.PHONY: clean
clean:
	rm -rf bin
