package lt.lhu.unit06_02.text.sentence;

import java.util.ArrayList;
import java.util.List;

import lt.lhu.unit06_02.Printable;

public class Sentence implements Printable {

	List<SentencePart> sentence = new ArrayList<SentencePart>();
	
	public void add(SentencePart sp) {
		sentence.add(sp);
	}

	@Override
	public void print() {
		System.out.println(sentence);
	}

}
