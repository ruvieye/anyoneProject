package pattern.Visitor.Sample;

import java.util.Iterator;

public class ListVisitor extends Visitor {
	private String currentdir = "";

	public void visit(File file) {
		System.out.println("f : "+currentdir + "/" + file);
	}

	public void visit(Directory directory) {
		System.out.println("d : " + currentdir + "/" + directory);
		String savedir = currentdir;
		currentdir = currentdir + "/" + directory.getName();

		Iterator it = directory.iterator();
		while (it.hasNext()) {
			Entry entry = (Entry) it.next();
			entry.accept(this);
		}

		currentdir = savedir;
	}
}
