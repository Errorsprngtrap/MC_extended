
package net.mcreator.springrami.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.springrami.entity.MeduseEntity;
import net.mcreator.springrami.client.model.ModelMeduse;

public class MeduseRenderer extends MobRenderer<MeduseEntity, ModelMeduse<MeduseEntity>> {
	public MeduseRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelMeduse(context.bakeLayer(ModelMeduse.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MeduseEntity entity) {
		return new ResourceLocation("springrami:textures/entities/meduse.png");
	}
}
