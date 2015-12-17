J = jifc

default: clean jifc

clean:
	rm -f ./*.class

jifc:
	@echo "-------------------"
	@echo "        Jif        "
	@echo "-------------------"
	$(J) HMS/principals/*.jif
	$(J) HMS/sql/*.jif
	$(J) -d jif-classes -addsigcp sig-classes/ HMS/sql/*.jif
	$(J) HMS/*.jif
