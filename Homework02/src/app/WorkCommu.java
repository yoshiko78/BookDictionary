package app;

public class WorkCommu implements Communication{
	@Override
	public String greet(String name) throws Exception {
		if("パパ".equals(name)) {
			throw new HazukasiiException("恥ずかしいから会社に来ないで！！！");
		} else if ("友達".equals(name)) {
			throw new OdorokiException("なんで会社にいるの？？？");
		}
		return name + "お疲れ様です！";
	}
}
