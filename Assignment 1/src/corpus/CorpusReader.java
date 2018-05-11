package corpus;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import org.xml.sax.SAXException;

import corpus.TaggedSentence;

public interface CorpusReader {
	
	public void read(String file) throws XPathExpressionException, ParserConfigurationException, SAXException, IOException;
	
	public Iterator<TaggedSentence>  getIterator();
	
	public List<TaggedSentence> getSentences(int i, int j);
	
	public int size();
	
	public String toString();

}