// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelBall<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "ball"), "main");
	private final ModelPart bb_main;

	public ModelBall(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-3.0F, -16.0F, -1.0F, 6.0F, 16.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(-4, -4)
						.addBox(-1.0F, -16.0F, -3.0F, 2.0F, 16.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(-2, -2)
						.addBox(-2.0F, -16.0F, -2.0F, 4.0F, 16.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-5.0F, -15.0F, -1.0F, 10.0F, 14.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(-8, -8)
						.addBox(-1.0F, -15.0F, -5.0F, 2.0F, 14.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(-6, -6)
						.addBox(-3.0F, -15.0F, -4.0F, 6.0F, 14.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(-4, -4)
						.addBox(-4.0F, -15.0F, -3.0F, 8.0F, 14.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(-10, -10)
						.addBox(-2.0F, -14.0F, -6.0F, 4.0F, 12.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(-2, -2)
						.addBox(-6.0F, -14.0F, -2.0F, 12.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(-8, -8)
						.addBox(-4.0F, -14.0F, -5.0F, 8.0F, 12.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(-6, -6)
						.addBox(-5.0F, -14.0F, -4.0F, 10.0F, 12.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-7.0F, -13.0F, -1.0F, 14.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(-12, -12)
						.addBox(-1.0F, -13.0F, -7.0F, 2.0F, 10.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(-10, -10)
						.addBox(-4.0F, -13.0F, -6.0F, 8.0F, 10.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(-6, -6)
						.addBox(-6.0F, -13.0F, -4.0F, 12.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(-8, -8)
						.addBox(-5.0F, -13.0F, -5.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(-12, -12)
						.addBox(-3.0F, -12.0F, -7.0F, 6.0F, 8.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(-4, -4)
						.addBox(-7.0F, -12.0F, -3.0F, 14.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(-8, -8)
						.addBox(-6.0F, -12.0F, -5.0F, 12.0F, 8.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(-10, -10)
						.addBox(-5.0F, -12.0F, -6.0F, 10.0F, 8.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-8.0F, -11.0F, -1.0F, 16.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(-14, -14)
						.addBox(-1.0F, -11.0F, -8.0F, 2.0F, 6.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(-6, -6)
						.addBox(-7.0F, -11.0F, -4.0F, 14.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(-12, -12)
						.addBox(-4.0F, -11.0F, -7.0F, 8.0F, 6.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(-2, -2)
						.addBox(-8.0F, -10.0F, -2.0F, 16.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(-14, -14)
						.addBox(-2.0F, -10.0F, -8.0F, 4.0F, 4.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(-10, -10)
						.addBox(-6.0F, -10.0F, -6.0F, 12.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(-14, -14)
						.addBox(-3.0F, -9.0F, -8.0F, 6.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(-4, -4)
						.addBox(-8.0F, -9.0F, -3.0F, 16.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(-8, -8)
						.addBox(-7.0F, -9.0F, -5.0F, 14.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(-12, -12)
						.addBox(-5.0F, -9.0F, -7.0F, 10.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 16, 16);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}