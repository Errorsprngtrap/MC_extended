package net.mcreator.springrami.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelMeduse<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("springrami", "model_meduse"), "main");
	public final ModelPart Meduse;

	public ModelMeduse(ModelPart root) {
		this.Meduse = root.getChild("Meduse");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Meduse = partdefinition.addOrReplaceChild("Meduse", CubeListBuilder.create(), PartPose.offset(0.0F, 25.0F, 0.0F));
		PartDefinition Head = Meduse.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offset(0.0F, -1.0F, 0.0F));
		PartDefinition bottom = Head.addOrReplaceChild("bottom",
				CubeListBuilder.create().texOffs(15, 15).addBox(-6.0F, 0.0F, -6.0F, 1.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(30, 19).addBox(-5.0F, 0.0F, -6.0F, 10.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 14)
						.addBox(-5.0F, 0.0F, 5.0F, 10.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 11).addBox(5.0F, 0.0F, -6.0F, 1.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -3.0F, 0.0F));
		PartDefinition middle = bottom.addOrReplaceChild("middle",
				CubeListBuilder.create().texOffs(32, 31).addBox(-4.0F, 0.0F, 4.0F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 27).addBox(4.0F, 0.0F, -5.0F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(23, 1)
						.addBox(-5.0F, 0.0F, -5.0F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(13, 31).addBox(-4.0F, 0.0F, -5.0F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -2.0F, 0.0F));
		PartDefinition up = middle.addOrReplaceChild("up", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -7.0F, -4.0F, 8.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 5.0F, 0.0F));
		PartDefinition Top = Meduse.addOrReplaceChild("Top", CubeListBuilder.create().texOffs(23, 35).addBox(0.0F, -1.0F, -1.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, -6.0F, 3.0F));
		PartDefinition Middle2 = Top.addOrReplaceChild("Middle2", CubeListBuilder.create().texOffs(28, 41).addBox(0.0F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 6.0F, 0.0F));
		PartDefinition Bottom2 = Middle2.addOrReplaceChild("Bottom2", CubeListBuilder.create().texOffs(0, 40).addBox(0.0F, 0.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 3.0F, 0.0F));
		PartDefinition Top5 = Meduse.addOrReplaceChild("Top5", CubeListBuilder.create().texOffs(15, 11).addBox(0.0F, -1.0F, -1.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, -6.0F, -1.0F));
		PartDefinition Middle6 = Top5.addOrReplaceChild("Middle6", CubeListBuilder.create().texOffs(10, 40).addBox(0.0F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 6.0F, 0.0F));
		PartDefinition Bottom6 = Middle6.addOrReplaceChild("Bottom6", CubeListBuilder.create().texOffs(28, 35).addBox(0.0F, 0.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 3.0F, 0.0F));
		PartDefinition Top6 = Meduse.addOrReplaceChild("Top6", CubeListBuilder.create().texOffs(5, 11).addBox(0.0F, -1.0F, -1.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, -6.0F, -1.0F));
		PartDefinition Middle7 = Top6.addOrReplaceChild("Middle7", CubeListBuilder.create().texOffs(5, 40).addBox(0.0F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 6.0F, 0.0F));
		PartDefinition Bottom7 = Middle7.addOrReplaceChild("Bottom7", CubeListBuilder.create().texOffs(25, 0).addBox(0.0F, 0.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 3.0F, 0.0F));
		PartDefinition Top2 = Meduse.addOrReplaceChild("Top2", CubeListBuilder.create().texOffs(5, 27).addBox(0.0F, -1.0F, -1.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, -6.0F, 1.0F));
		PartDefinition Middle3 = Top2.addOrReplaceChild("Middle3", CubeListBuilder.create().texOffs(41, 5).addBox(0.0F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 6.0F, 0.0F));
		PartDefinition Bottom3 = Middle3.addOrReplaceChild("Bottom3", CubeListBuilder.create().texOffs(38, 35).addBox(0.0F, 0.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 3.0F, 0.0F));
		PartDefinition Top4 = Meduse.addOrReplaceChild("Top4", CubeListBuilder.create().texOffs(20, 14).addBox(0.0F, -1.0F, -1.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -6.0F, 1.0F));
		PartDefinition Middle5 = Top4.addOrReplaceChild("Middle5", CubeListBuilder.create().texOffs(15, 40).addBox(0.0F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 6.0F, 0.0F));
		PartDefinition Bottom5 = Middle5.addOrReplaceChild("Bottom5", CubeListBuilder.create().texOffs(33, 35).addBox(0.0F, 0.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 3.0F, 0.0F));
		PartDefinition Top3 = Meduse.addOrReplaceChild("Top3", CubeListBuilder.create().texOffs(0, 27).addBox(0.0F, -1.0F, -1.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, -6.0F, 3.0F));
		PartDefinition Middle4 = Top3.addOrReplaceChild("Middle4", CubeListBuilder.create().texOffs(41, 0).addBox(0.0F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 6.0F, 0.0F));
		PartDefinition Bottom4 = Middle4.addOrReplaceChild("Bottom4", CubeListBuilder.create().texOffs(36, 0).addBox(0.0F, 0.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 3.0F, 0.0F));
		PartDefinition Top7 = Meduse.addOrReplaceChild("Top7", CubeListBuilder.create().texOffs(0, 11).addBox(0.0F, -1.0F, -1.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, -5.0F, -3.0F));
		PartDefinition Middle8 = Top7.addOrReplaceChild("Middle8", CubeListBuilder.create().texOffs(36, 6).addBox(0.0F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 6.0F, 0.0F));
		PartDefinition Bottom8 = Middle8.addOrReplaceChild("Bottom8", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 0.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 3.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Meduse.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
