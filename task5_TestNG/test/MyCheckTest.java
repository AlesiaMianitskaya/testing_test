import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.math.BigDecimal;

import static org.testng.AssertJUnit.assertEquals;

public class MyCheckTest {

  private static final String PATH = "D:\\JetBrains\\IdeaProjects\\project2\\dataForTriangle.xml";
  private static final String EXPECTED = "expected";
  private static final String NEGATIVE = "negative";
  private static final String POSITIVE = "positive";
  private static final String NULL_SIDE = "nullSide";
  private static final String SIDE_A = "side_a";
  private static final String SIDE_B = "side_b";
  private static final String SIDE_C = "side_c";

  private MyCheck myCheck;

  @BeforeMethod
  public void setMyCheck() {
    myCheck = new MyCheck();
  }

  @DataProvider(name = "dataNegativeFromXML")
  public Object[][] readNegativeXML() throws Exception {
    File inputFile = new File(PATH);
    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
    DocumentBuilder builder = factory.newDocumentBuilder();

    Document document = builder.parse(inputFile);
    NodeList nodes = document.getElementsByTagName(NEGATIVE);
    Object[][] result = new Object[nodes.getLength()][];
    for (int i = 0; i < nodes.getLength(); i++) {
      NamedNodeMap attrs = nodes.item(i).getAttributes();
      result[i] = new Object[]{
          new Boolean(attrs.getNamedItem(EXPECTED).getNodeValue()),
          new BigDecimal(attrs.getNamedItem(SIDE_A).getNodeValue()),
          new BigDecimal(attrs.getNamedItem(SIDE_B).getNodeValue()),
          new BigDecimal(attrs.getNamedItem(SIDE_C).getNodeValue())
      };
    }
    return result;
  }

  @Test(dataProvider = "dataNegativeFromXML")
  public void testCheckExistNegative(boolean expected, BigDecimal a, BigDecimal b, BigDecimal c) throws Exception {
    assertEquals(expected, myCheck.checkExist(a, b, c));
  }

  @DataProvider(name = "dataPositiveFromXML")
  public Object[][] readPositiveXML() throws Exception {
    File inputFile = new File(PATH);
    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
    DocumentBuilder builder = factory.newDocumentBuilder();

    Document document = builder.parse(inputFile);
    NodeList nodes = document.getElementsByTagName(POSITIVE);
    Object[][] result = new Object[nodes.getLength()][];
    for (int i = 0; i < nodes.getLength(); i++) {
      NamedNodeMap attrs = nodes.item(i).getAttributes();
      result[i] = new Object[]{
          new Boolean(attrs.getNamedItem(EXPECTED).getNodeValue()),
          new BigDecimal(attrs.getNamedItem(SIDE_A).getNodeValue()),
          new BigDecimal(attrs.getNamedItem(SIDE_B).getNodeValue()),
          new BigDecimal(attrs.getNamedItem(SIDE_C).getNodeValue())
      };
    }
    return result;
  }

  @Test(dataProvider = "dataPositiveFromXML")
  public void testCheckExistPositive(boolean expected, BigDecimal a, BigDecimal b, BigDecimal c) throws Exception {
    assertEquals(expected, myCheck.checkExist(a, b, c));
  }

  @DataProvider(name = "dataNullFromXML")
  public Object[][] readNullXML() throws Exception {
    File inputFile = new File(PATH);
    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
    DocumentBuilder builder = factory.newDocumentBuilder();

    Document document = builder.parse(inputFile);
    NodeList nodes = document.getElementsByTagName(NULL_SIDE);
    Object[][] result = new BigDecimal[nodes.getLength()][];
    for (int i = 0; i < nodes.getLength(); i++) {
      NamedNodeMap attrs = nodes.item(i).getAttributes();
      result[i] = new BigDecimal[]{
          attrs.getNamedItem(SIDE_A) == null ? null : new BigDecimal(attrs.getNamedItem(SIDE_A).getNodeValue()),
          attrs.getNamedItem(SIDE_B) == null ? null : new BigDecimal(attrs.getNamedItem(SIDE_B).getNodeValue()),
          attrs.getNamedItem(SIDE_C) == null ? null : new BigDecimal(attrs.getNamedItem(SIDE_C).getNodeValue())
      };
    }
    return result;
  }

  @Test(dataProvider = "dataNullFromXML", expectedExceptions = NullPointerException.class)
  public void testCheckExistNull(BigDecimal a, BigDecimal b, BigDecimal c) {
    myCheck.checkExist(a, b, c);
  }
}