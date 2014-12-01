
public class Symbol
{
  private String name;
  private String type1;
  private String type2;
  private String scope;
  private String value;
  
  public Symbol(String name, String type1, String type2, String scope, String value)
  {
	name = new String();
	type1 = new String();
	type2 = new String();
	scope = new String();
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public String getType1()
  {
    return type1;
  }

  public void setType1(String type1)
  {
    this.type1 = type1;
  }

  public String getType2()
  {
    return type2;
  }

  public void setType2(String type2)
  {
    this.type2 = type2;
  }

  public String getScope()
  {
    return scope;
  }

  public void setScope(String scope)
  {
    this.scope = scope;
  }

  public String getValue()
  {
    return value;
  }

  public void setValue(String value)
  {
    this.value = value;
  }
}
