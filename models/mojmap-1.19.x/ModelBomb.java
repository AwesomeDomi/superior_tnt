// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelBomb<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "bomb"), "main");
	private final ModelPart bb_main;

	public ModelBomb(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(120, 120)
						.addBox(-3.0F, -16.0F, -1.0F, 6.0F, 16.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(88, 120)
						.addBox(-1.0F, -16.0F, -3.0F, 2.0F, 16.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(104, 120)
						.addBox(-2.0F, -16.0F, -2.0F, 4.0F, 16.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(120, 50)
						.addBox(-5.0F, -15.0F, -1.0F, 10.0F, 14.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(64, 108)
						.addBox(-1.0F, -15.0F, -5.0F, 2.0F, 14.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(36, 104)
						.addBox(-3.0F, -15.0F, -4.0F, 6.0F, 14.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(106, 30)
						.addBox(-4.0F, -15.0F, -3.0F, 8.0F, 14.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(96, 96)
						.addBox(-2.0F, -14.0F, -6.0F, 4.0F, 12.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(104, 80)
						.addBox(-6.0F, -14.0F, -2.0F, 12.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(72, 86)
						.addBox(-4.0F, -14.0F, -5.0F, 8.0F, 12.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 96)
						.addBox(-5.0F, -14.0F, -4.0F, 10.0F, 12.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 116)
						.addBox(-7.0F, -13.0F, -1.0F, 14.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(88, 36)
						.addBox(-1.0F, -13.0F, -7.0F, 2.0F, 10.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(40, 60)
						.addBox(-4.0F, -13.0F, -6.0F, 8.0F, 10.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(32, 86)
						.addBox(-6.0F, -13.0F, -4.0F, 12.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 74)
						.addBox(-5.0F, -13.0F, -5.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 52)
						.addBox(-3.0F, -12.0F, -7.0F, 6.0F, 8.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(88, 66)
						.addBox(-7.0F, -12.0F, -3.0F, 14.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(34, 42)
						.addBox(-6.0F, -12.0F, -5.0F, 12.0F, 8.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(36, 4)
						.addBox(-5.0F, -12.0F, -6.0F, 10.0F, 8.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(104, 0)
						.addBox(-8.0F, -11.0F, -1.0F, 16.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(68, 44)
						.addBox(-1.0F, -11.0F, -8.0F, 2.0F, 6.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(68, 0)
						.addBox(-7.0F, -11.0F, -4.0F, 14.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(4, 31)
						.addBox(-4.0F, -11.0F, -7.0F, 8.0F, 6.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(98, 22)
						.addBox(-8.0F, -10.0F, -2.0F, 16.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(64, 66)
						.addBox(-2.0F, -10.0F, -8.0F, 4.0F, 4.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 16)
						.addBox(-6.0F, -10.0F, -6.0F, 12.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(32, 24)
						.addBox(-3.0F, -9.0F, -8.0F, 6.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(80, 14)
						.addBox(-8.0F, -9.0F, -3.0F, 16.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(60, 24)
						.addBox(-7.0F, -9.0F, -5.0F, 14.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(4, 3)
						.addBox(-5.0F, -9.0F, -7.0F, 10.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(0.0F, -18.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 0)
						.addBox(-1.0F, -19.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(3, 2)
						.addBox(-2.0F, -20.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 3)
						.addBox(-2.0F, -21.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 256, 256);
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