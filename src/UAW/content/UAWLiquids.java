package UAW.content;

import UAW.audiovisual.UAWPal;
import mindustry.content.StatusEffects;
import mindustry.type.Liquid;

public class UAWLiquids {
	public static Liquid placeholder,
	// Gas
	steam;

	public static void load() {

		steam = new Liquid("gas-steam", UAWPal.steamFront) {{
			gas = true;
			alwaysUnlocked = true;
			explosiveness = 0f;
			temperature = 0.6f;
			effect = StatusEffects.wet;
		}};
		plasma = new Liquid("plasma") {{
			gas = true;
			alwaysUnlocked = true;
			explosiveness = 0f;
			temperature = 0.6f;
			effect = StatusEffects.burning;
		}};
	}
}
