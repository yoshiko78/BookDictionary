package app;

public class HomeCommu implements Communication{
	@Override
	public String greet(String name) throws Exception{
		if("上司".equals(name)) {
			throw new HazukasiiException("家で上司には会いたくない・・・");
		} else if ("友達".equals(name)){
			System.out.println("ようこそわが家へ！来てくれてありがとう");
		}
		return name + "おはよう。今日もいい天気だね。";
	}

}
