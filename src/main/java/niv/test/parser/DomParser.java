package niv.test.parser;

import java.io.ByteArrayInputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import niv.test.container.Container;
import niv.test.model.BranchAndFinancialInstitutionIdentification;
import niv.test.model.FinancialInstitutionIdentification;

public class DomParser {

	private static final String BICFI = "BICFI";
	private static final String BRNCH_ID = "BrnchId";
	private static final String FIN_INSTN_ID = "FinInstnId";
	private static final String INSTD_AGT = "InstdAgt";
	private static final String INSTG_AGT = "InstgAgt";
	private static final String GRP_HDR = "GrpHdr";

	public DomParser() {
	}
	
	public Container parse(String xml) throws Exception {
		Container c = new Container();
		
		DocumentBuilder dBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		Document doc = dBuilder.parse(new ByteArrayInputStream(xml.getBytes()));

		NodeList nl = doc.getElementsByTagName(GRP_HDR);
		Node n = nl.item(0);

		c.setInstgAgt(fillBranchAndFinancialInstitutionIdentificationByTag(n, INSTG_AGT));
		c.setInstdAgt(fillBranchAndFinancialInstitutionIdentificationByTag(n, INSTD_AGT));
		
		return c;
	}

	private BranchAndFinancialInstitutionIdentification fillBranchAndFinancialInstitutionIdentificationByTag(Node header, String tag) {
		NodeList nodeList = header.getChildNodes();
		
		BranchAndFinancialInstitutionIdentification o = null;
		
		for (int count = 0; count < nodeList.getLength(); count++) {
			Node tempNode = nodeList.item(count);
			
			if (tag.equals(tempNode.getNodeName())) {
				o = fillBranchAndFinInstIdentification(tempNode);
				break;
			}
		}
		
		return o;
	}
	
	private BranchAndFinancialInstitutionIdentification fillBranchAndFinInstIdentification(Node instAgt) {
		NodeList nodeList = instAgt.getChildNodes();

		if (nodeList.getLength() == 0) {
			return null;
		}
		
		BranchAndFinancialInstitutionIdentification o = new BranchAndFinancialInstitutionIdentification();
		
		for (int count = 0; count < nodeList.getLength(); count++) {
			Node tempNode = nodeList.item(count);
			
			if (FIN_INSTN_ID.equals(tempNode.getNodeName())) {
				FinancialInstitutionIdentification f = fillFinInstIdentidication(tempNode);
				o.setFinInstnId(f);
			} else if (BRNCH_ID.equals(tempNode.getNodeName())) {
				// TODO Заполнение BrnchId
			}
		}
		
		return o;
	}
	
	private FinancialInstitutionIdentification fillFinInstIdentidication(Node finInstnId) {
		NodeList nodeList = finInstnId.getChildNodes();

		FinancialInstitutionIdentification o = new FinancialInstitutionIdentification();
		
		for (int count = 0; count < nodeList.getLength(); count++) {
			Node tempNode = nodeList.item(count);
			
			if (BICFI.equals(tempNode.getNodeName())) {
				o.setBICFI(tempNode.getTextContent());
			}
			// TODO Остальные поля FinInstnId
		}

		return o;
	}
}
