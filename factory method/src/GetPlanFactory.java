
public class GetPlanFactory {
public plan getPlan(String planType){
	if(planType==null)
	{
		return null;
	}
	if(planType.equalsIgnoreCase("DOMESTIC PLAN"))
	{
		return new DomesticPlan();
	}
	else if(planType.equalsIgnoreCase("COMMERCIAL PLAN"))
	{
		return new CommercialPlan();
	}
	if(planType.equalsIgnoreCase("INSTITUTIONAL PLAN"))
	{
		return new InstitionalPlan();
	}
}

}
