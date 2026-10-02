package pers.solid.mishang.uc.blocks;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import pers.solid.mishang.uc.annotations.Cutout;
import pers.solid.mishang.uc.block.*;
import pers.solid.mishang.uc.data.MishangucModels;
import pers.solid.mishang.uc.util.LineColor;
import pers.solid.mishang.uc.util.LineType;

/**
 * <h1>道路方块部分</h1>
 * <p>
 * 最基本的普通路块。
 */
public final class RoadBlocks extends MishangucBlocks {
    public static final RoadBlock ROAD_BLOCK = new RoadBlock(ROAD_SETTINGS, MishangucModels.texture("asphalt"), LineColor.NONE);
    /**
     * <h2>单一的直线道路</h2>
     * <p>
     * 白色直线。
     */
    @Cutout
    public static final RoadWithStraightLine.Impl ROAD_WITH_WHITE_LINE = new RoadWithStraightLine.Impl(WHITE_ROAD_SETTINGS, LineColor.WHITE, LineType.NORMAL, "white_straight_line");
    /**
     * 白色双线。
     */
    @Cutout
    public static final RoadWithStraightLine.Impl ROAD_WITH_WHITE_DOUBLE_LINE = new RoadWithStraightLine.Impl(WHITE_ROAD_SETTINGS, LineColor.WHITE, LineType.DOUBLE, "white_straight_double_line");
    /**
     * 白色双线分岔。
     */
    @Cutout
    public static final RoadWithOffsetEndLine.Impl ROAD_WITH_WHITE_BIBA_TO_DOUBLE_LINE =
            new RoadWithOffsetEndLine.Impl(WHITE_ROAD_SETTINGS, LineColor.WHITE, LineType.SPECIAL, "white_bi_bevel_angle_line_to_straight_double_line", "white_straight_double_line", 2, true);
    /**
     * 白色连续双线分岔。
     */
    @Cutout
    public static final RoadWithStraightLine.Impl ROAD_WITH_WHITE_DOUBLE_BIBA_LINE = new RoadWithStraightLine.Impl(WHITE_ROAD_SETTINGS, LineColor.WHITE, LineType.DOUBLE, "white_straight_double_line_and_bi_bevel_angle_line");
    /**
     * 白色双线窄间距。
     */
    @Cutout
    public static final RoadWithStraightLine.Impl ROAD_WITH_WHITE_DOUBLE_LINE2 = new RoadWithStraightLine.Impl(WHITE_ROAD_SETTINGS, LineColor.WHITE, LineType.DOUBLE, "white_straight_double_line2");
    /**
     * 白色双线宽间距。
     */
    @Cutout
    public static final RoadWithStraightLine.Impl ROAD_WITH_WHITE_DOUBLE_LINE3 = new RoadWithStraightLine.Impl(WHITE_ROAD_SETTINGS, LineColor.WHITE, LineType.DOUBLE, "white_straight_double_line3");
    /**
     * 白色停车让行线。
     */
    @Cutout
    public static final RoadWithStraightLine.Impl ROAD_WITH_WHITE_STOP_LINE = new RoadWithStraightLine.Impl(WHITE_ROAD_SETTINGS, LineColor.WHITE, LineType.DOUBLE, "white_straight_stop_line");
    /**
     * 白色减速让行线。
     */
    @Cutout
    public static final RoadWithStraightLine.Impl ROAD_WITH_WHITE_GIVEWAY_LINE = new RoadWithStraightLine.Impl(WHITE_ROAD_SETTINGS, LineColor.WHITE, LineType.DOUBLE, "white_straight_gw_line");
    /**
     * 白色潮汐车道停止线。
     */
    @Cutout
    public static final RoadWithStraightLine.Impl ROAD_WITH_WHITE_REV_LINE = new RoadWithStraightLine.Impl(WHITE_ROAD_SETTINGS, LineColor.WHITE, LineType.DOUBLE, "white_straight_rev_line");
    /**
     * 白色粗线。
     */
    @Cutout
    public static final RoadWithStraightLine.Impl ROAD_WITH_WHITE_THICK_LINE = new RoadWithStraightLine.Impl(WHITE_ROAD_SETTINGS, LineColor.WHITE, LineType.THICK, "white_straight_thick_line");
    /**
     * 白色边缘线。
     */
    @Cutout
    public static final RoadWithStraightLine.Impl ROAD_WITH_WHITE_EDGE_LINE =
            new RoadWithStraightLine.Impl(
                    WHITE_ROAD_SETTINGS,
                    LineColor.WHITE,
                    LineType.EDGE,
                    "white_straight_edge_line"
            );
    /**
     * 白色边缘虚线。
     */
    @Cutout
    public static final RoadWithStraightLine.Impl ROAD_WITH_WHITE_EDGE_DASH_LINE =
            new RoadWithStraightLine.Impl(
                    WHITE_ROAD_SETTINGS,
                    LineColor.WHITE,
                    LineType.EDGE,
                    "white_straight_edge_dash_line"
            );
    /**
     * 白色边缘虚线终点。
     */
    @Cutout
    public static final RoadWithOffsetEndLine.Impl ROAD_WITH_WHITE_EDGE_DASH_E_LINE =
            new RoadWithOffsetEndLine.Impl(WHITE_ROAD_SETTINGS, LineColor.WHITE, LineType.EDGE, "white_straight_edge_dash_end_line", "white_straight_edge_line", 2, true);
    /**
     * 白色窄线。
     */
    @Cutout
    public static final RoadWithStraightLine.Impl ROAD_WITH_WHITE_THIN_LINE =
            new RoadWithStraightLine.Impl(
                    WHITE_ROAD_SETTINGS,
                    LineColor.WHITE,
                    LineType.THIN,
                    "white_straight_thin_line"
            );
    /**
     * 白色出租车上下客线。
     */
    @Cutout
    public static final RoadWithStraightLine.Impl ROAD_WITH_WHITE_TAXI_LINE =
            new RoadWithStraightLine.Impl(
                    WHITE_ROAD_SETTINGS,
                    LineColor.WHITE,
                    LineType.TAXI,
                    "white_straight_taxi_line"
            );
    /**
     * 公交专用线
     */
    @Cutout
    public static final RoadWithStraightLine.Impl ROAD_WITH_WHITE_BUS_LINE =
            new RoadWithStraightLine.Impl(
                    WHITE_ROAD_SETTINGS,
                    LineColor.WHITE,
                    LineType.SPECIAL,
                    "white_straight_bus_line"
            );
    /**
     * 黄色直线
     */
    @Cutout
    public static final RoadWithStraightLine.Impl ROAD_WITH_YELLOW_LINE = new RoadWithStraightLine.Impl(YELLOW_ROAD_SETTINGS, LineColor.YELLOW, LineType.NORMAL, "yellow_straight_line");
    /**
     * 双黄线
     */
    @Cutout
    public static final RoadWithStraightLine.Impl ROAD_WITH_YELLOW_DOUBLE_LINE = new RoadWithStraightLine.Impl(YELLOW_ROAD_SETTINGS, LineColor.YELLOW, LineType.DOUBLE, "yellow_straight_double_line");
    /**
     * 双黄线分岔
     */
    @Cutout
    public static final RoadWithOffsetEndLine.Impl ROAD_WITH_YELLOW_BIBA_TO_DOUBLE_LINE =
            new RoadWithOffsetEndLine.Impl(YELLOW_ROAD_SETTINGS, LineColor.YELLOW, LineType.SPECIAL, "yellow_bi_bevel_angle_line_to_straight_double_line", "yellow_straight_double_line", 2, true);
    /**
     * 连续双黄线分岔
     */
    @Cutout
    public static final RoadWithStraightLine.Impl ROAD_WITH_YELLOW_DOUBLE_BIBA_LINE = new RoadWithStraightLine.Impl(YELLOW_ROAD_SETTINGS, LineColor.YELLOW, LineType.DOUBLE, "yellow_straight_double_line_and_bi_bevel_angle_line");
    /**
     * 双黄线窄间距
     */
    @Cutout
    public static final RoadWithStraightLine.Impl ROAD_WITH_YELLOW_DOUBLE_LINE2 = new RoadWithStraightLine.Impl(YELLOW_ROAD_SETTINGS, LineColor.YELLOW, LineType.DOUBLE, "yellow_straight_double_line2");
    /**
     * 双黄线宽间距
     */
    @Cutout
    public static final RoadWithStraightLine.Impl ROAD_WITH_YELLOW_DOUBLE_LINE3 = new RoadWithStraightLine.Impl(YELLOW_ROAD_SETTINGS, LineColor.YELLOW, LineType.DOUBLE, "yellow_straight_double_line3");
    /**
     * 粗黄线
     */
    @Cutout
    public static final RoadWithStraightLine.Impl ROAD_WITH_YELLOW_THICK_LINE = new RoadWithStraightLine.Impl(YELLOW_ROAD_SETTINGS, LineColor.YELLOW, LineType.THICK, "yellow_straight_thick_line");
    /**
     * 20cm 黄色边缘线（直边线）。
     */
    @Cutout
    public static final RoadWithStraightLine.Impl ROAD_WITH_YELLOW_EDGE_LINE =
            new RoadWithStraightLine.Impl(
                    WHITE_ROAD_SETTINGS,
                    LineColor.YELLOW,
                    LineType.EDGE,
                    "yellow_straight_edge_line"
            );
    /**
     * 作业区直线
     */
    @Cutout
    public static final RoadWithStraightLine.Impl ROAD_WITH_ORANGE_LINE = new RoadWithStraightLine.Impl(ORANGE_ROAD_SETTINGS, LineColor.ORANGE, LineType.NORMAL, "orange_straight_line");
    /**
     * 作业区双线
     */
    @Cutout
    public static final RoadWithStraightLine.Impl ROAD_WITH_ORANGE_DOUBLE_LINE = new RoadWithStraightLine.Impl(ORANGE_ROAD_SETTINGS, LineColor.ORANGE, LineType.DOUBLE, "orange_straight_double_line");
    /**
     * 红色粗直线
     */
    @Cutout
    public static final RoadWithStraightLine.Impl ROAD_WITH_RED_THICK_LINE = new RoadWithStraightLine.Impl(RED_ROAD_SETTINGS, LineColor.RED, LineType.THICK, "red_straight_thick_line");
    /**
     * <h3>混色双线</h3>
     * 白色和黄色混合的双直线道路。
     */
    @Cutout
    @ApiStatus.AvailableSince("1.1.0")
    public static final RoadWithOffsetStraightLine.Impl ROAD_WITH_WHITE_YELLOW_DOUBLE_LINE = new RoadWithOffsetStraightLine.Impl(YELLOW_ROAD_SETTINGS, LineColor.WHITE, LineType.DOUBLE, "white_yellow_double_straight_line", 114514);
    /**
     * <h3>偏移的直线</h3>
     * 白色偏移的直线。
     */
    @Cutout
    public static final RoadWithOffsetStraightLine.Impl ROAD_WITH_WHITE_OFFSET_LINE = new RoadWithOffsetStraightLine.Impl(WHITE_ROAD_SETTINGS, LineColor.WHITE, LineType.NORMAL, "white_offset_straight_line", 2);
    /**
     * 白色偏移边缘线。
     */
    @Cutout
    public static final RoadWithOffsetStraightLine.Impl ROAD_WITH_WHITE_OFFSET_EDGE_LINE = new RoadWithOffsetStraightLine.Impl(WHITE_ROAD_SETTINGS, LineColor.WHITE, LineType.EDGE, "white_offset_straight_edge_line", 2);
    /**
     * 白色偏移禁停线。
     */
    @Cutout
    public static final RoadWithOffsetStraightLine.Impl ROAD_WITH_WHITE_OFFSET_NP_M_LINE = new RoadWithOffsetStraightLine.Impl(WHITE_ROAD_SETTINGS, LineColor.WHITE, LineType.SPECIAL, "white_offset_straight_np_mid_line", 2);
    /**
     * 白色偏移禁长时停线。
     */
    @Cutout
    public static final RoadWithOffsetStraightLine.Impl ROAD_WITH_WHITE_OFFSET_NLP_M_LINE = new RoadWithOffsetStraightLine.Impl(WHITE_ROAD_SETTINGS, LineColor.WHITE, LineType.SPECIAL, "white_offset_straight_nlp_mid_line", 2);
    /**
     * 白色偏移禁停线终点。
     */
    @Cutout
    public static final RoadWithOffsetEndLine.Impl ROAD_WITH_WHITE_OFFSET_NP_E_LINE =
            new RoadWithOffsetEndLine.Impl(WHITE_ROAD_SETTINGS, LineColor.WHITE, LineType.SPECIAL, "white_offset_straight_np_end_line", "white_offset_straight_np_mid_line", 2, true);
    /**
     * 白色偏移禁停线终点（样式2）。
     */
    @Cutout
    public static final RoadWithOffsetEndLine.Impl ROAD_WITH_WHITE_OFFSET_NP_E_LINE2 =
            new RoadWithOffsetEndLine.Impl(WHITE_ROAD_SETTINGS, LineColor.WHITE, LineType.SPECIAL, "white_offset_straight_np_end_line2", "white_offset_straight_np_mid_line", 2, false);
    /**
     * 白色偏移禁长时停线终点。
     */
    @Cutout
    public static final RoadWithOffsetEndLine.Impl ROAD_WITH_WHITE_OFFSET_NLP_E_LINE =
            new RoadWithOffsetEndLine.Impl(WHITE_ROAD_SETTINGS, LineColor.WHITE, LineType.SPECIAL, "white_offset_straight_nlp_end_line", "white_offset_straight_nlp_mid_line", 2, true);

    /**
     * 白色偏移禁长时停线终点（样式2）。
     */
    @Cutout
    public static final RoadWithOffsetEndLine.Impl ROAD_WITH_WHITE_OFFSET_NLP_E_LINE2 =
            new RoadWithOffsetEndLine.Impl(WHITE_ROAD_SETTINGS, LineColor.WHITE, LineType.SPECIAL, "white_offset_straight_nlp_end_line2", "white_offset_straight_nlp_mid_line", 2, false);
    /**
     * 白色偏移出入口线（虚线部分）。
     */
    @Cutout
    public static final RoadWithOffsetStraightLine.Impl ROAD_WITH_WHITE_OFFSET_ACCESS_LINE = new RoadWithOffsetStraightLine.Impl(WHITE_ROAD_SETTINGS, LineColor.WHITE, LineType.ACCESS, "white_offset_straight_access_line", 2);
    /**
     * 白色偏移出入口线（中间部分）。
     */
    @Cutout
    public static final RoadWithOffsetStraightLine.Impl ROAD_WITH_WHITE_OFFSET_ACCESS_MID_LINE = new RoadWithOffsetStraightLine.Impl(WHITE_ROAD_SETTINGS, LineColor.WHITE, LineType.ACCESS, "white_offset_straight_access_mid_line", 2);
    /**
     * 白色偏移出入口线（末端部分）。
     */
    @Cutout
    public static final RoadWithOffsetAccessLine.Impl ROAD_WITH_WHITE_OFFSET_ACCESS_END_LINE =
            new RoadWithOffsetAccessLine.Impl(WHITE_ROAD_SETTINGS, LineColor.WHITE, LineType.ACCESS, "white_offset_straight_access_end_side_line", 2);
    /**
     * 偏移的黄线。
     */
    @Cutout
    public static final RoadWithOffsetStraightLine.Impl ROAD_WITH_YELLOW_OFFSET_LINE = new RoadWithOffsetStraightLine.Impl(YELLOW_ROAD_SETTINGS, LineColor.YELLOW, LineType.NORMAL, "yellow_offset_straight_line", 2);
    /**
     * 偏移的黄边缘线。
     */
    @Cutout
    public static final RoadWithOffsetStraightLine.Impl ROAD_WITH_YELLOW_OFFSET_EDGE_LINE = new RoadWithOffsetStraightLine.Impl(YELLOW_ROAD_SETTINGS, LineColor.YELLOW, LineType.EDGE, "yellow_offset_straight_edge_line", 2);
    /**
     * 白色的半双线。
     */
    @ApiStatus.AvailableSince("0.2.4")
    @Cutout
    public static final RoadWithOffsetStraightLine.Impl ROAD_WITH_WHITE_HALF_DOUBLE_LINE = new RoadWithOffsetStraightLine.Impl(WHITE_ROAD_SETTINGS, LineColor.WHITE, LineType.NORMAL, "white_half_double_line", 1);
    /**
     * 黄色的半双线。
     */
    @ApiStatus.AvailableSince("0.2.4")
    @Cutout
    public static final RoadWithOffsetStraightLine.Impl ROAD_WITH_YELLOW_HALF_DOUBLE_LINE = new RoadWithOffsetStraightLine.Impl(YELLOW_ROAD_SETTINGS, LineColor.YELLOW, LineType.NORMAL, "yellow_half_double_line", 1);
    /**
     * <h2>角落标线</h2>
     * <h3>直角</h3>
     * 白色直角。
     */
    @Cutout
    public static final RoadWithAngleLine.Impl ROAD_WITH_WHITE_RA_LINE = new RoadWithAngleLine.Impl(WHITE_ROAD_SETTINGS, LineColor.WHITE, LineType.NORMAL, false, "white_right_angle_line");
    /**
     * 白色边缘直角。
     */
    @Cutout
    public static final RoadWithAngleLine.Impl ROAD_WITH_WHITE_RA_EDGE_LINE = new RoadWithAngleLine.Impl(WHITE_ROAD_SETTINGS, LineColor.WHITE, LineType.EDGE, false, "white_right_angle_edge_line");
    /**
     * 白色边缘直角。
     */
    @Cutout
    public static final RoadWithAngleLine.Impl ROAD_WITH_WHITE_RA_TAXI_LINE = new RoadWithAngleLine.Impl(WHITE_ROAD_SETTINGS, LineColor.WHITE, LineType.TAXI, false, "white_right_angle_taxi_line");
    /**
     * 黄色直角
     */
    @Cutout
    public static final RoadWithAngleLine.Impl ROAD_WITH_YELLOW_RA_LINE = new RoadWithAngleLine.Impl(YELLOW_ROAD_SETTINGS, LineColor.YELLOW, LineType.NORMAL, false, "yellow_right_angle_line");
    /**
     * 黄色边缘直角
     */
    @Cutout
    public static final RoadWithAngleLine.Impl ROAD_WITH_YELLOW_RA_EDGE_LINE = new RoadWithAngleLine.Impl(YELLOW_ROAD_SETTINGS, LineColor.YELLOW, LineType.EDGE, false, "yellow_right_angle_edge_line");
    /**
     * 作业区直角
     */
    @Cutout
    public static final RoadWithAngleLine.Impl ROAD_WITH_ORANGE_RA_LINE = new RoadWithAngleLine.Impl(ORANGE_ROAD_SETTINGS, LineColor.ORANGE, LineType.NORMAL, false, "orange_right_angle_line");
    /**
     * 白色加黄色直角
     */
    @Cutout
    public static final RoadWithDiffAngleLine.Impl ROAD_WITH_W_Y_RA_LINE = new RoadWithDiffAngleLine.Impl(YELLOW_ROAD_SETTINGS, LineColor.WHITE, LineColor.YELLOW, LineType.NORMAL, LineType.NORMAL, false, "yellow_straight_line", "white_and_yellow_right_angle_line");
    /**
     * 白色粗线加白色直角
     */
    @Cutout
    public static final RoadWithDiffAngleLine.Impl ROAD_WITH_WT_N_RA_LINE = new RoadWithDiffAngleLine.Impl(WHITE_ROAD_SETTINGS, LineColor.WHITE, LineColor.WHITE, LineType.THICK, LineType.NORMAL, false, "white_straight_line", "white_thick_and_normal_right_angle_line");
    /**
     * 白色粗线加白色边缘直角
     */
    @Cutout
    public static final RoadWithDiffAngleLine.Impl ROAD_WITH_WT_E_RA_LINE = new RoadWithDiffAngleLine.Impl(WHITE_ROAD_SETTINGS, LineColor.WHITE, LineColor.WHITE, LineType.THICK, LineType.EDGE, false, "white_straight_edge_line", "white_thick_and_edge_right_angle_line");
    /**
     * 白色细线加白色的士上下客直角
     */
    @Cutout
    public static final RoadWithDiffAngleLine.Impl ROAD_WITH_WTH_TAXI_RA_LINE = new RoadWithDiffAngleLine.Impl(WHITE_ROAD_SETTINGS, LineColor.WHITE, LineColor.WHITE, LineType.THIN, LineType.TAXI, false, "white_straight_thin_line", "white_thin_and_taxi_right_angle_line");
    /**
     * 白色粗线加黄色直角
     */
    @Cutout
    public static final RoadWithDiffAngleLine.Impl ROAD_WITH_WT_Y_RA_LINE = new RoadWithDiffAngleLine.Impl(YELLOW_ROAD_SETTINGS, LineColor.WHITE, LineColor.YELLOW, LineType.THICK, LineType.NORMAL, false, "yellow_straight_line", "white_thick_and_yellow_right_angle_line");
    /**
     * 白色停车让行线加黄色直角
     */
    @Cutout
    public static final RoadWithDiffAngleLine.Impl ROAD_WITH_WS_Y_RA_LINE =
            new RoadWithDiffAngleLine.Impl(YELLOW_ROAD_SETTINGS, LineColor.WHITE, LineColor.YELLOW,
                    LineType.DOUBLE, LineType.NORMAL, false,
                    "white_straight_stop_line",          // lineSide：白色侧面
                    "yellow_straight_line",       // lineSide2：黄色侧面
                    "white_stop_and_yellow_right_angle_line");
    /**
     * 白色减速让行线加黄色直角
     */
    @Cutout
    public static final RoadWithDiffAngleLine.Impl ROAD_WITH_WGW_Y_RA_LINE =
            new RoadWithDiffAngleLine.Impl(YELLOW_ROAD_SETTINGS, LineColor.WHITE, LineColor.YELLOW,
                    LineType.DOUBLE, LineType.NORMAL, false,
                    "white_straight_gw_line",          // lineSide：白色侧面
                    "yellow_straight_line",       // lineSide2：黄色侧面
                    "white_gw_and_yellow_right_angle_line");
    /**
     * 作业区双线直角
     */
    @Cutout
    public static final RoadWithDiffAngleLine.Impl ROAD_WITH_O_OD_RA_LINE = new RoadWithDiffAngleLine.Impl(ORANGE_ROAD_SETTINGS, LineColor.ORANGE, LineColor.ORANGE, LineType.NORMAL, LineType.DOUBLE, false, "orange_straight_double_line", "orange_double_right_angle_line");
    /**
     * 白色加黄色双线直角
     */
    @Cutout
    public static final RoadWithDiffAngleLine.Impl ROAD_WITH_W_YD_RA_LINE = new RoadWithDiffAngleLine.Impl(YELLOW_ROAD_SETTINGS, LineColor.WHITE, LineColor.YELLOW, LineType.NORMAL, LineType.DOUBLE, false, "yellow_straight_double_line", "white_and_yellow_double_right_angle_line");
    /**
     * 白色粗线加黄色双线直角
     */
    @Cutout
    public static final RoadWithDiffAngleLine.Impl ROAD_WITH_WT_YD_RA_LINE = new RoadWithDiffAngleLine.Impl(YELLOW_ROAD_SETTINGS, LineColor.WHITE, LineColor.YELLOW, LineType.THICK, LineType.DOUBLE, false, "yellow_straight_double_line", "white_thick_and_yellow_double_right_angle_line");
    /**
     * 白色停车让行线加黄色双线直角
     */
    @Cutout
    public static final RoadWithDiffAngleLine.Impl ROAD_WITH_WS_YD_RA_LINE =
            new RoadWithDiffAngleLine.Impl(YELLOW_ROAD_SETTINGS, LineColor.WHITE, LineColor.YELLOW,
                    LineType.DOUBLE, LineType.DOUBLE, false,
                    "white_straight_stop_line",          // lineSide：白色侧面
                    "yellow_straight_double_line",       // lineSide2：黄色侧面
                    "white_stop_and_yellow_double_right_angle_line");
    /**
     * 白色减速让行线加黄色双线直角
     */
    @Cutout
    public static final RoadWithDiffAngleLine.Impl ROAD_WITH_WGW_YD_RA_LINE =
            new RoadWithDiffAngleLine.Impl(YELLOW_ROAD_SETTINGS, LineColor.WHITE, LineColor.YELLOW,
                    LineType.DOUBLE, LineType.DOUBLE, false,
                    "white_straight_gw_line",          // lineSide：白色侧面
                    "yellow_straight_double_line",       // lineSide2：黄色侧面
                    "white_gw_and_yellow_double_right_angle_line");
    /**
     * 白色潮汐车道停止线加黄色双线直角
     */
    @Cutout
    public static final RoadWithDiffAngleLine.Impl ROAD_WITH_WR_YD_RA_LINE =
            new RoadWithDiffAngleLine.Impl(YELLOW_ROAD_SETTINGS, LineColor.WHITE, LineColor.YELLOW,
                    LineType.DOUBLE, LineType.DOUBLE, false,
                    "white_straight_rev_line",          // lineSide：白色侧面
                    "yellow_straight_double_line",       // lineSide2：黄色侧面
                    "white_rev_and_yellow_double_right_angle_line");
    /**
     * <h3>斜线</h3>
     * 白色斜线。
     */
    @Cutout
    public static final RoadWithAngleLine.Impl ROAD_WITH_WHITE_BA_LINE = new RoadWithAngleLine.Impl(WHITE_ROAD_SETTINGS, LineColor.WHITE, LineType.NORMAL, true, "white_bevel_angle_line");
    /**
     * 白色双斜线。
     */
    @ApiStatus.AvailableSince("1.0.2")
    @Cutout
    public static final RoadWithAngleLine.Impl ROAD_WITH_WHITE_BA_DOUBLE_LINE = new RoadWithAngleLine.Impl(WHITE_ROAD_SETTINGS, LineColor.WHITE, LineType.DOUBLE, true, "white_bevel_angle_double_line");
    /**
     * 白色停车让行斜线。
     */
    @ApiStatus.AvailableSince("1.0.2")
    @Cutout
    public static final RoadWithAngleLine.Impl ROAD_WITH_WHITE_BA_STOP_LINE = new RoadWithAngleLine.Impl(WHITE_ROAD_SETTINGS, LineColor.WHITE, LineType.DOUBLE, true, "white_bevel_angle_stop_line");
    /**
     * 白色减速让行斜线。
     */
    @ApiStatus.AvailableSince("1.0.2")
    @Cutout
    public static final RoadWithAngleLine.Impl ROAD_WITH_WHITE_BA_GIVEWAY_LINE = new RoadWithAngleLine.Impl(WHITE_ROAD_SETTINGS, LineColor.WHITE, LineType.DOUBLE, true, "white_bevel_angle_gw_line");
    /**
     * 白色窄间距双斜线。
     */
    @ApiStatus.AvailableSince("1.0.2")
    @Cutout
    public static final RoadWithAngleLine.Impl ROAD_WITH_WHITE_BA_DOUBLE_LINE2 = new RoadWithAngleLine.Impl(WHITE_ROAD_SETTINGS, LineColor.WHITE, LineType.DOUBLE, true, "white_bevel_angle_double_line2");
    /**
     * 白色宽间距双斜线。
     */
    @ApiStatus.AvailableSince("1.0.2")
    @Cutout
    public static final RoadWithAngleLine.Impl ROAD_WITH_WHITE_BA_DOUBLE_LINE3 = new RoadWithAngleLine.Impl(WHITE_ROAD_SETTINGS, LineColor.WHITE, LineType.DOUBLE, true, "white_bevel_angle_double_line3");
    /**
     * 白色粗斜线。
     */
    @ApiStatus.AvailableSince("1.0.2")
    @Cutout
    public static final RoadWithAngleLine.Impl ROAD_WITH_WHITE_BA_THICK_LINE = new RoadWithAngleLine.Impl(WHITE_ROAD_SETTINGS, LineColor.WHITE, LineType.THICK, true, "white_bevel_angle_thick_line");
    /**
     * 白色边缘斜线。
     */
    @ApiStatus.AvailableSince("1.0.2")
    @Cutout
    public static final RoadWithAngleLine.Impl ROAD_WITH_WHITE_BA_EDGE_LINE = new RoadWithAngleLine.Impl(WHITE_ROAD_SETTINGS, LineColor.WHITE, LineType.EDGE, true, "white_bevel_angle_edge_line");
    /**
     * 黄色斜线。
     */
    @Cutout
    public static final RoadWithAngleLine.Impl ROAD_WITH_YELLOW_BA_LINE = new RoadWithAngleLine.Impl(YELLOW_ROAD_SETTINGS, LineColor.YELLOW, LineType.NORMAL, true, "yellow_bevel_angle_line");
    /**
     * 黄色双斜线。
     */
    @ApiStatus.AvailableSince("1.0.2")
    @Cutout
    public static final RoadWithAngleLine.Impl ROAD_WITH_YELLOW_BA_DOUBLE_LINE = new RoadWithAngleLine.Impl(YELLOW_ROAD_SETTINGS, LineColor.YELLOW, LineType.DOUBLE, true, "yellow_bevel_angle_double_line");
    /**
     * 黄色粗斜线。
     */
    @ApiStatus.AvailableSince("1.0.2")
    @Cutout
    public static final RoadWithAngleLine.Impl ROAD_WITH_YELLOW_BA_THICK_LINE = new RoadWithAngleLine.Impl(YELLOW_ROAD_SETTINGS, LineColor.YELLOW, LineType.THICK, true, "yellow_bevel_angle_thick_line");
    /**
     * 黄色边缘斜线。
     */
    @ApiStatus.AvailableSince("1.0.2")
    @Cutout
    public static final RoadWithAngleLine.Impl ROAD_WITH_YELLOW_BA_EDGE_LINE = new RoadWithAngleLine.Impl(YELLOW_ROAD_SETTINGS, LineColor.YELLOW, LineType.THICK, true, "yellow_bevel_angle_edge_line");
    /**
     * 作业区斜线。
     */
    @Cutout
    public static final RoadWithAngleLine.Impl ROAD_WITH_ORANGE_BA_LINE = new RoadWithAngleLine.Impl(ORANGE_ROAD_SETTINGS, LineColor.ORANGE, LineType.NORMAL, true, "orange_bevel_angle_line");
    /**
     * 红色粗斜线。
     */
    @Cutout
    public static final RoadWithAngleLine.Impl ROAD_WITH_RED_BA_THICK_LINE = new RoadWithAngleLine.Impl(RED_ROAD_SETTINGS, LineColor.RED, LineType.THICK, true, "red_bevel_angle_thick_line");
    /**
     * <h3>有偏移的直角</h3>
     * 白色一侧向外偏移的直角。
     */
    @Cutout
    public static final RoadWithAngleLineWithOnePartOffset.Impl ROAD_WITH_WHITE_RA_LINE_OFFSET_OUT = new RoadWithAngleLineWithOnePartOffset.Impl(WHITE_ROAD_SETTINGS, LineColor.WHITE, false, "white_offset_straight_line", "white_right_angle_line_with_one_part_offset_out", 2);
    /**
     * 边缘白色一侧向外偏移的直角。
     */
    @Cutout
    public static final RoadWithAngleLineWithOnePartOffset.Impl ROAD_WITH_WHITE_RA_EDGE_LINE_OFFSET_OUT = new RoadWithAngleLineWithOnePartOffset.Impl(WHITE_ROAD_SETTINGS, LineColor.WHITE, false, "white_offset_straight_edge_line", "white_right_angle_edge_line_with_one_part_offset_out", 2);
    /**
     * 白色一侧向内偏移的直角。
     */
    @Cutout
    public static final RoadWithAngleLineWithOnePartOffset.Impl ROAD_WITH_WHITE_RA_LINE_OFFSET_IN = new RoadWithAngleLineWithOnePartOffset.Impl(WHITE_ROAD_SETTINGS, LineColor.WHITE, false, "white_offset_straight_line2", "white_right_angle_line_with_one_part_offset_in", -2);
    /**
     * 边缘白色一侧向内偏移的直角。
     */
    @Cutout
    public static final RoadWithAngleLineWithOnePartOffset.Impl ROAD_WITH_WHITE_RA_EDGE_LINE_OFFSET_IN = new RoadWithAngleLineWithOnePartOffset.Impl(WHITE_ROAD_SETTINGS, LineColor.WHITE, false, "white_offset_straight_edge_line2", "white_right_angle_edge_line_with_one_part_offset_in", -2);
    /**
     * 白色两边均向外偏移的直角。
     */
    @ApiStatus.AvailableSince("1.1.0")
    @Cutout
    public static final RoadWithAngleLineWithTwoPartsOffset.Impl ROAD_WITH_WHITE_OFFSET_OUT_RA_LINE = new RoadWithAngleLineWithTwoPartsOffset.Impl(WHITE_ROAD_SETTINGS, LineColor.WHITE, LineType.NORMAL, false, "white_offset_out_right_angle_line", "white_offset_straight_line", "white_offset_straight_line2", 2);
    /**
     * 白色边缘两边均向外偏移的直角。
     */
    @ApiStatus.AvailableSince("1.1.0")
    @Cutout
    public static final RoadWithAngleLineWithTwoPartsOffset.Impl ROAD_WITH_WHITE_OFFSET_OUT_RA_EDGE_LINE = new RoadWithAngleLineWithTwoPartsOffset.Impl(WHITE_ROAD_SETTINGS, LineColor.WHITE, LineType.NORMAL, false, "white_offset_out_right_angle_edge_line", "white_offset_straight_edge_line", "white_offset_straight_edge_line2", 2);
    /**
     * 白色两边均向内偏移的直角。
     */
    @ApiStatus.AvailableSince("1.1.0")
    @Cutout
    public static final RoadWithAngleLineWithTwoPartsOffset.Impl ROAD_WITH_WHITE_OFFSET_IN_RA_LINE = new RoadWithAngleLineWithTwoPartsOffset.Impl(WHITE_ROAD_SETTINGS, LineColor.WHITE, LineType.NORMAL, false, "white_offset_in_right_angle_line", "white_offset_straight_line2", "white_offset_straight_line", -2);
    /**
     * 白色两边均向内偏移的直角。
     */
    @ApiStatus.AvailableSince("1.1.0")
    @Cutout
    public static final RoadWithAngleLineWithTwoPartsOffset.Impl ROAD_WITH_WHITE_OFFSET_IN_RA_EDGE_LINE = new RoadWithAngleLineWithTwoPartsOffset.Impl(WHITE_ROAD_SETTINGS, LineColor.WHITE, LineType.NORMAL, false, "white_offset_in_right_angle_edge_line", "white_offset_straight_edge_line2", "white_offset_straight_edge_line", -2);
    /**
     * 白色两边均向外偏移的斜线。
     */
    @ApiStatus.AvailableSince("1.1.0")
    @Cutout
    public static final RoadWithAngleLineWithTwoPartsOffset.Impl ROAD_WITH_WHITE_OFFSET_OUT_BA_LINE = new RoadWithAngleLineWithTwoPartsOffset.Impl(WHITE_ROAD_SETTINGS, LineColor.WHITE, LineType.NORMAL, true, "white_offset_out_bevel_angle_line", "white_offset_straight_line", "white_offset_straight_line2", 2);
    /**
     * 边缘白色两边均向外偏移的斜线。
     */
    @ApiStatus.AvailableSince("1.1.0")
    @Cutout
    public static final RoadWithAngleLineWithTwoPartsOffset.Impl ROAD_WITH_WHITE_OFFSET_OUT_BA_EDGE_LINE = new RoadWithAngleLineWithTwoPartsOffset.Impl(WHITE_ROAD_SETTINGS, LineColor.WHITE, LineType.NORMAL, true, "white_offset_out_bevel_angle_edge_line", "white_offset_straight_edge_line", "white_offset_straight_edge_line2", 2);
    /**
     * 白色两边均向内偏移的斜线。
     */
    @ApiStatus.AvailableSince("1.1.0")
    @Cutout
    public static final RoadWithAngleLineWithTwoPartsOffset.Impl ROAD_WITH_WHITE_OFFSET_IN_BA_LINE = new RoadWithAngleLineWithTwoPartsOffset.Impl(WHITE_ROAD_SETTINGS, LineColor.WHITE, LineType.NORMAL, true, "white_offset_in_bevel_angle_line", "white_offset_straight_line2", "white_offset_straight_line", -2);
    /**
     * 边缘白色两边均向内偏移的斜线。
     */
    @ApiStatus.AvailableSince("1.1.0")
    @Cutout
    public static final RoadWithAngleLineWithTwoPartsOffset.Impl ROAD_WITH_WHITE_OFFSET_IN_BA_EDGE_LINE = new RoadWithAngleLineWithTwoPartsOffset.Impl(WHITE_ROAD_SETTINGS, LineColor.WHITE, LineType.NORMAL, true, "white_offset_in_bevel_angle_edge_line", "white_offset_straight_edge_line2", "white_offset_straight_edge_line", -2);
    /**
     * 两边均向外偏移的斜禁停线。
     */
    @ApiStatus.AvailableSince("1.1.0")
    @Cutout
    public static final RoadWithAngleLineWithTwoPartsOffset.Impl ROAD_WITH_WHITE_OFFSET_OUT_BA_NP_M_LINE = new RoadWithAngleLineWithTwoPartsOffset.Impl(WHITE_ROAD_SETTINGS, LineColor.WHITE, LineType.SPECIAL, true, "white_offset_out_bevel_angle_np_mid_line", "white_offset_straight_np_mid_line", "white_offset_straight_np_mid_line2", 2);
    /**
     * 两边均向内偏移的斜禁停线。
     */
    @ApiStatus.AvailableSince("1.1.0")
    @Cutout
    public static final RoadWithAngleLineWithTwoPartsOffset.Impl ROAD_WITH_WHITE_OFFSET_IN_BA_NP_M_LINE = new RoadWithAngleLineWithTwoPartsOffset.Impl(WHITE_ROAD_SETTINGS, LineColor.WHITE, LineType.SPECIAL, true, "white_offset_in_bevel_angle_np_mid_line", "white_offset_straight_np_mid_line2", "white_offset_straight_np_mid_line", -2);
    /**
     * 两边均向外偏移的斜禁长时停线。
     */
    @ApiStatus.AvailableSince("1.1.0")
    @Cutout
    public static final RoadWithAngleLineWithTwoPartsOffset.Impl ROAD_WITH_WHITE_OFFSET_OUT_BA_NLP_M_LINE = new RoadWithAngleLineWithTwoPartsOffset.Impl(WHITE_ROAD_SETTINGS, LineColor.WHITE, LineType.SPECIAL, true, "white_offset_out_bevel_angle_nlp_mid_line", "white_offset_straight_nlp_mid_line", "white_offset_straight_nlp_mid_line2", 2);
    /**
     * 两边均向内偏移的斜禁长时停线。
     */
    @ApiStatus.AvailableSince("1.1.0")
    @Cutout
    public static final RoadWithAngleLineWithTwoPartsOffset.Impl ROAD_WITH_WHITE_OFFSET_IN_BA_NLP_M_LINE = new RoadWithAngleLineWithTwoPartsOffset.Impl(WHITE_ROAD_SETTINGS, LineColor.WHITE, LineType.SPECIAL, true, "white_offset_in_bevel_angle_nlp_mid_line", "white_offset_straight_nlp_mid_line2", "white_offset_straight_nlp_mid_line", -2);
    /**
     * 黄色一侧向外偏移的直角。
     */
    @ApiStatus.AvailableSince("1.1.0")
    @Cutout
    public static final RoadWithAngleLineWithOnePartOffset.Impl ROAD_WITH_YELLOW_RA_LINE_OFFSET_OUT = new RoadWithAngleLineWithOnePartOffset.Impl(YELLOW_ROAD_SETTINGS, LineColor.YELLOW, false, "yellow_offset_straight_line", "yellow_right_angle_line_with_one_part_offset_out", 2);
    /**
     * 边缘黄色一侧向外偏移的直角。
     */
    @ApiStatus.AvailableSince("1.1.0")
    @Cutout
    public static final RoadWithAngleLineWithOnePartOffset.Impl ROAD_WITH_YELLOW_RA_EDGE_LINE_OFFSET_OUT = new RoadWithAngleLineWithOnePartOffset.Impl(YELLOW_ROAD_SETTINGS, LineColor.YELLOW, false, "yellow_offset_straight_edge_line", "yellow_right_angle_edge_line_with_one_part_offset_out", 2);
    /**
     * 黄色一侧向内偏移的直角。
     */
    @ApiStatus.AvailableSince("1.1.0")
    @Cutout
    public static final RoadWithAngleLineWithOnePartOffset.Impl ROAD_WITH_YELLOW_RA_LINE_OFFSET_IN = new RoadWithAngleLineWithOnePartOffset.Impl(YELLOW_ROAD_SETTINGS, LineColor.YELLOW, false, "yellow_offset_straight_line2", "yellow_right_angle_line_with_one_part_offset_in", -2);
    /**
     * 边缘黄色一侧向内偏移的直角。
     */
    @ApiStatus.AvailableSince("1.1.0")
    @Cutout
    public static final RoadWithAngleLineWithOnePartOffset.Impl ROAD_WITH_YELLOW_RA_EDGE_LINE_OFFSET_IN = new RoadWithAngleLineWithOnePartOffset.Impl(YELLOW_ROAD_SETTINGS, LineColor.YELLOW, false, "yellow_offset_straight_edge_line2", "yellow_right_angle_edge_line_with_one_part_offset_in", -2);
    /**
     * 两边均向外偏移的黄色直角。
     */
    @ApiStatus.AvailableSince("1.1.0")
    @Cutout
    public static final RoadWithAngleLineWithTwoPartsOffset.Impl ROAD_WITH_YELLOW_OFFSET_OUT_RA_LINE = new RoadWithAngleLineWithTwoPartsOffset.Impl(YELLOW_ROAD_SETTINGS, LineColor.YELLOW, LineType.NORMAL, false, "yellow_offset_out_right_angle_line", "yellow_offset_straight_line", "yellow_offset_straight_line2", 2);
    /**
     * 边缘两边均向外偏移的黄色直角。
     */
    @ApiStatus.AvailableSince("1.1.0")
    @Cutout
    public static final RoadWithAngleLineWithTwoPartsOffset.Impl ROAD_WITH_YELLOW_OFFSET_OUT_RA_EDGE_LINE = new RoadWithAngleLineWithTwoPartsOffset.Impl(YELLOW_ROAD_SETTINGS, LineColor.YELLOW, LineType.NORMAL, false, "yellow_offset_out_right_angle_edge_line", "yellow_offset_straight_edge_line", "yellow_offset_straight_edge_line2", 2);
    /**
     * 两边均向内偏移的黄色直角。
     */
    @ApiStatus.AvailableSince("1.1.0")
    @Cutout
    public static final RoadWithAngleLineWithTwoPartsOffset.Impl ROAD_WITH_YELLOW_OFFSET_IN_RA_LINE = new RoadWithAngleLineWithTwoPartsOffset.Impl(YELLOW_ROAD_SETTINGS, LineColor.YELLOW, LineType.NORMAL, false, "yellow_offset_in_right_angle_line", "yellow_offset_straight_line2", "yellow_offset_straight_line", -2);
    /**
     * 边缘两边均向内偏移的黄色直角。
     */
    @ApiStatus.AvailableSince("1.1.0")
    @Cutout
    public static final RoadWithAngleLineWithTwoPartsOffset.Impl ROAD_WITH_YELLOW_OFFSET_IN_RA_EDGE_LINE = new RoadWithAngleLineWithTwoPartsOffset.Impl(YELLOW_ROAD_SETTINGS, LineColor.YELLOW, LineType.NORMAL, false, "yellow_offset_in_right_angle_edge_line", "yellow_offset_straight_edge_line2", "yellow_offset_straight_edge_line", -2);
    /**
     * 两边均向外偏移的黄色斜线。
     */
    @ApiStatus.AvailableSince("1.1.0")
    @Cutout
    public static final RoadWithAngleLineWithTwoPartsOffset.Impl ROAD_WITH_YELLOW_OFFSET_OUT_BA_LINE = new RoadWithAngleLineWithTwoPartsOffset.Impl(YELLOW_ROAD_SETTINGS, LineColor.YELLOW, LineType.NORMAL, true, "yellow_offset_out_bevel_angle_line", "yellow_offset_straight_line", "yellow_offset_straight_line2", 2);
    /**
     * 边缘两边均向外偏移的黄色斜线。
     */
    @ApiStatus.AvailableSince("1.1.0")
    @Cutout
    public static final RoadWithAngleLineWithTwoPartsOffset.Impl ROAD_WITH_YELLOW_OFFSET_OUT_BA_EDGE_LINE = new RoadWithAngleLineWithTwoPartsOffset.Impl(YELLOW_ROAD_SETTINGS, LineColor.YELLOW, LineType.NORMAL, true, "yellow_offset_out_bevel_angle_edge_line", "yellow_offset_straight_edge_line", "yellow_offset_straight_edge_line2", 2);

    /**
     * 两边均向内偏移的黄色斜线。
     */
    @ApiStatus.AvailableSince("1.1.0")
    @Cutout
    public static final RoadWithAngleLineWithTwoPartsOffset.Impl ROAD_WITH_YELLOW_OFFSET_IN_BA_LINE = new RoadWithAngleLineWithTwoPartsOffset.Impl(YELLOW_ROAD_SETTINGS, LineColor.YELLOW, LineType.NORMAL, true, "yellow_offset_in_bevel_angle_line", "yellow_offset_straight_line2", "yellow_offset_straight_line", -2);
    /**
     * 边缘两边均向内偏移的黄色斜线。
     */
    @ApiStatus.AvailableSince("1.1.0")
    @Cutout
    public static final RoadWithAngleLineWithTwoPartsOffset.Impl ROAD_WITH_YELLOW_OFFSET_IN_BA_EDGE_LINE = new RoadWithAngleLineWithTwoPartsOffset.Impl(YELLOW_ROAD_SETTINGS, LineColor.YELLOW, LineType.NORMAL, true, "yellow_offset_in_bevel_angle_edge_line", "yellow_offset_straight_edge_line2", "yellow_offset_straight_edge_line", -2);
    /**
     * <h2>T字形线路</h2>
     * <h3>无偏移同色</h3>
     * 白色T字形线。
     */
    @Cutout
    public static final RoadWithJointLine.Impl ROAD_WITH_WHITE_TS_LINE = new RoadWithJointLine.Impl(WHITE_ROAD_SETTINGS, LineColor.WHITE, LineColor.WHITE, LineType.NORMAL, LineType.NORMAL, "white_joint_line");
    /**
     * 白色T字形细线。
     */
    @Cutout
    public static final RoadWithJointLine.Impl ROAD_WITH_WHITE_TS_THIN_LINE = new RoadWithJointLine.Impl(WHITE_ROAD_SETTINGS, LineColor.WHITE, LineColor.WHITE, LineType.THIN, LineType.THIN, "white_joint_thin_line");
    /**
     * 白色T字形出租车上下客线。
     */
    @Cutout
    public static final RoadWithJointLine.Impl ROAD_WITH_WHITE_TS_TAXI_LINE = new RoadWithJointLine.Impl(WHITE_ROAD_SETTINGS, LineColor.WHITE, LineColor.WHITE, LineType.TAXI, LineType.TAXI, "white_joint_taxi_line");
    /**
     * 黄色T字形线。
     */
    @Cutout
    public static final RoadWithJointLine.Impl ROAD_WITH_YELLOW_TS_LINE = new RoadWithJointLine.Impl(YELLOW_ROAD_SETTINGS, LineColor.YELLOW, LineColor.YELLOW, LineType.NORMAL, LineType.NORMAL, "yellow_joint_line");
    /**
     * 作业区T字形线。
     */
    @Cutout
    public static final RoadWithJointLine.Impl ROAD_WITH_ORANGE_TS_LINE = new RoadWithJointLine.Impl(ORANGE_ROAD_SETTINGS, LineColor.ORANGE, LineColor.ORANGE, LineType.NORMAL, LineType.NORMAL, "orange_joint_line");
    /**
     * <p>
     * T字形，其中单侧部分为双线。
     */
    @Cutout
    public static final RoadWithJointLine.Impl ROAD_WITH_WHITE_TS_DOUBLE_LINE = new RoadWithJointLine.Impl(WHITE_ROAD_SETTINGS, LineColor.WHITE, LineColor.WHITE, LineType.NORMAL, LineType.DOUBLE, "white_joint_line_with_double_side");
    /**
     * T字形，其中单侧部分为粗线。
     */
    @Cutout
    public static final RoadWithJointLine.Impl ROAD_WITH_WHITE_TS_THICK_LINE = new RoadWithJointLine.Impl(WHITE_ROAD_SETTINGS, LineColor.WHITE, LineColor.WHITE, LineType.NORMAL, LineType.THICK, "white_joint_line_with_thick_side");
    /**
     * T字形，直线部分为双线。
     */
    @Cutout
    public static final RoadWithJointLine.Impl ROAD_WITH_WHITE_DOUBLE_TS_LINE = new RoadWithJointLine.Impl(WHITE_ROAD_SETTINGS, LineColor.WHITE, LineColor.WHITE, LineType.DOUBLE, LineType.NORMAL, "white_double_joint_line");
    /**
     * T字形，直线部分为停车让行线。
     */
    @Cutout
    public static final RoadWithJointLine.Impl ROAD_WITH_WHITE_STOP_TS_LINE =
            new RoadWithJointLine.Impl(WHITE_ROAD_SETTINGS, LineColor.WHITE, LineColor.WHITE,
                    LineType.DOUBLE, LineType.NORMAL,
                    "white_straight_stop_line",   // lineSide：主干线
                    "white_straight_line",        // lineSide2：侧线
                    "white_stop_joint_line");
    /**
     * 边缘T字形，直线部分为停车让行线。
     */
    @Cutout
    public static final RoadWithJointLine.Impl ROAD_WITH_WHITE_STOP_TS_EDGE_LINE =
            new RoadWithJointLine.Impl(WHITE_ROAD_SETTINGS, LineColor.WHITE, LineColor.WHITE,
                    LineType.DOUBLE, LineType.NORMAL,
                    "white_straight_stop_line",   // lineSide：主干线
                    "white_straight_edge_line",        // lineSide2：侧线
                    "white_stop_joint_with_edge_side");
    /**
     * T字形，直线部分为减速让行线。
     */
    @Cutout
    public static final RoadWithJointLine.Impl ROAD_WITH_WHITE_GW_TS_LINE =
            new RoadWithJointLine.Impl(WHITE_ROAD_SETTINGS, LineColor.WHITE, LineColor.WHITE,
                    LineType.DOUBLE, LineType.NORMAL,
                    "white_straight_gw_line",   // lineSide：主干线
                    "white_straight_line",        // lineSide2：侧线
                    "white_gw_joint_line");
    /**
     * 边缘线T字形，直线部分为减速让行线。
     */
    @Cutout
    public static final RoadWithJointLine.Impl ROAD_WITH_WHITE_GW_TS_EDGE_LINE =
            new RoadWithJointLine.Impl(WHITE_ROAD_SETTINGS, LineColor.WHITE, LineColor.WHITE,
                    LineType.DOUBLE, LineType.NORMAL,
                    "white_straight_gw_line",   // lineSide：主干线
                    "white_straight_edge_line",        // lineSide2：侧线
                    "white_gw_joint_line_with_edge_side");
    /**
     * T字形，直线部分为粗线。
     */
    @Cutout
    public static final RoadWithJointLine.Impl ROAD_WITH_WHITE_THICK_TS_LINE = new RoadWithJointLine.Impl(WHITE_ROAD_SETTINGS, LineColor.WHITE, LineColor.WHITE, LineType.THICK, LineType.NORMAL, "white_thick_joint_line");
    /**
     * 边缘线T字形，直线部分为粗线。
     */
    @Cutout
    public static final RoadWithJointLine.Impl ROAD_WITH_WHITE_THICK_TS_EDGE_LINE =
            new RoadWithJointLine.Impl(WHITE_ROAD_SETTINGS, LineColor.WHITE, LineColor.WHITE,
                    LineType.THICK, LineType.NORMAL,
                    "white_straight_thick_line",   // lineSide：主干线
                    "white_straight_edge_line",        // lineSide2：侧线
                    "white_thick_joint_line_with_edge_side");
    /**
     * 的士上下客T字形，直线部分为细线。
     */
    @Cutout
    public static final RoadWithJointLine.Impl ROAD_WITH_WHITE_THIN_TS_TAXI_LINE =
            new RoadWithJointLine.Impl(WHITE_ROAD_SETTINGS, LineColor.WHITE, LineColor.WHITE,
                    LineType.THIN, LineType.TAXI,
                    "white_straight_thin_line",   // lineSide：主干线
                    "white_straight_taxi_line",        // lineSide2：侧线
                    "white_thin_joint_line_with_taxi_side");
    /**
     * <h3>无偏移异色</h3>
     * 黄色加白色。
     */
    @Cutout
    public static final RoadWithJointLine.Impl ROAD_WITH_Y_TS_W_LINE = new RoadWithJointLine.Impl(YELLOW_ROAD_SETTINGS, LineColor.YELLOW, LineColor.WHITE, LineType.NORMAL, LineType.NORMAL, "yellow_joint_line_with_white_side");
    /**
     * 白色加黄色。
     */
    @Cutout
    public static final RoadWithJointLine.Impl ROAD_WITH_W_TS_Y_LINE = new RoadWithJointLine.Impl(YELLOW_ROAD_SETTINGS, LineColor.WHITE, LineColor.YELLOW, LineType.NORMAL, LineType.NORMAL, "white_joint_line_with_yellow_side");
    /**
     * 白色加黄色双。
     */
    @Cutout
    public static final RoadWithJointLine.Impl ROAD_WITH_W_TS_YD_LINE = new RoadWithJointLine.Impl(YELLOW_ROAD_SETTINGS, LineColor.WHITE, LineColor.YELLOW, LineType.NORMAL, LineType.DOUBLE, "white_joint_line_with_yellow_double_side");
    /**
     * 白色粗加黄色。
     */
    @ApiStatus.AvailableSince("0.2.0")
    @Cutout
    public static final RoadWithJointLine.Impl ROAD_WITH_WT_TS_Y_LINE = new RoadWithJointLine.Impl(YELLOW_ROAD_SETTINGS, LineColor.WHITE, LineColor.YELLOW, LineType.THICK, LineType.NORMAL, "white_thick_joint_line_with_yellow_side");
    /**
     * 白色粗加黄色双。
     */
    @Cutout
    public static final RoadWithJointLine.Impl ROAD_WITH_WT_TS_YD_LINE = new RoadWithJointLine.Impl(YELLOW_ROAD_SETTINGS, LineColor.WHITE, LineColor.YELLOW, LineType.THICK, LineType.DOUBLE, "white_thick_joint_line_with_yellow_double_side");

    /**
     * <h3>有偏移同色</h3>
     * T字形，其中单侧部分有偏移。
     */
    @Cutout
    public static final RoadWithJointLineWithOffsetSide.Impl ROAD_WITH_WHITE_TS_OFFSET_LINE = new RoadWithJointLineWithOffsetSide.Impl(WHITE_ROAD_SETTINGS, ROAD_WITH_WHITE_TS_LINE, "white_joint_line_with_offset_side", 2);
    /**
     * 黄色有偏移T形。
     */
    @ApiStatus.AvailableSince("1.1.0")
    @Cutout
    public static final RoadWithJointLineWithOffsetSide.Impl ROAD_WITH_YELLOW_TS_OFFSET_LINE = new RoadWithJointLineWithOffsetSide.Impl(YELLOW_ROAD_SETTINGS, ROAD_WITH_YELLOW_TS_LINE, "yellow_joint_line_with_offset_side", 2);
    /**
     * 有偏移的T字形，其中直线为双线。
     */
    @ApiStatus.AvailableSince("1.1.0")
    @Cutout
    public static final RoadWithJointLineWithOffsetSide.Impl ROAD_WITH_WHITE_DOUBLE_TS_OFFSET_LINE = new RoadWithJointLineWithOffsetSide.Impl(WHITE_ROAD_SETTINGS, ROAD_WITH_WHITE_DOUBLE_TS_LINE, "white_double_joint_line_with_offset_side", 2);
    /**
     * 有偏移的T字形，其中直线为停车让行线。
     */
    @ApiStatus.AvailableSince("1.1.0")
    @Cutout
    public static final RoadWithJointLineWithOffsetSide.Impl ROAD_WITH_WHITE_STOP_TS_OFFSET_LINE =
            new RoadWithJointLineWithOffsetSide.Impl(WHITE_ROAD_SETTINGS, ROAD_WITH_WHITE_DOUBLE_TS_LINE,
                    "white_straight_stop_line",             // lineSide：主干线 STOP
                    "white_offset_straight_line",      // lineSide2：偏移侧线的 STOP 版本
                    "white_stop_joint_line_with_offset_side", 2);
    /**
     * 有偏移的T字形，其中直线为粗线。
     */
    @ApiStatus.AvailableSince("1.1.0")
    @Cutout
    public static final RoadWithJointLineWithOffsetSide.Impl ROAD_WITH_WHITE_THICK_TS_OFFSET_LINE = new RoadWithJointLineWithOffsetSide.Impl(WHITE_ROAD_SETTINGS, ROAD_WITH_WHITE_THICK_TS_LINE, "white_thick_joint_line_with_offset_side", 2);

    /**
     * <h3>有偏移异色</h3>
     * 有偏移的黄色加白色。
     */
    @Cutout
    @ApiStatus.AvailableSince("1.1.0")
    public static final RoadWithJointLineWithOffsetSide.Impl ROAD_WITH_Y_TS_OFFSET_W_LINE = new RoadWithJointLineWithOffsetSide.Impl(YELLOW_ROAD_SETTINGS, ROAD_WITH_Y_TS_W_LINE, "yellow_joint_line_with_offset_white_side", 2);
    /**
     * 有偏移的白色加黄色。
     */
    @Cutout
    @ApiStatus.AvailableSince("1.1.0")
    public static final RoadWithJointLineWithOffsetSide.Impl ROAD_WITH_W_TS_OFFSET_Y_LINE = new RoadWithJointLineWithOffsetSide.Impl(YELLOW_ROAD_SETTINGS, ROAD_WITH_W_TS_Y_LINE, "white_joint_line_with_offset_yellow_side", 2);
    /**
     * 有偏移的白色粗加黄色。
     */
    @ApiStatus.AvailableSince("1.1.0")
    @Cutout
    public static final RoadWithJointLineWithOffsetSide.Impl ROAD_WITH_WT_TS_OFFSET_Y_LINE = new RoadWithJointLineWithOffsetSide.Impl(YELLOW_ROAD_SETTINGS, ROAD_WITH_WT_TS_Y_LINE, "white_thick_joint_line_with_offset_yellow_side", 2);
    /**
     * <h2>双角落标线</h2>
     * 有两个斜线的线路。
     */
    @ApiStatus.AvailableSince("1.1.0")
    @Cutout
    public static final RoadWithTwoBevelAngleLines.ImplWithTwoLayerTexture ROAD_WITH_WHITE_BI_BA_LINE = new RoadWithTwoBevelAngleLines.ImplWithTwoLayerTexture(WHITE_ROAD_SETTINGS, LineColor.WHITE, LineType.NORMAL);
    @ApiStatus.AvailableSince("1.1.0")
    @Cutout
    public static final RoadWithTwoBevelAngleLines.ImplWithTwoLayerTexture ROAD_WITH_YELLOW_BI_BA_LINE = new RoadWithTwoBevelAngleLines.ImplWithTwoLayerTexture(YELLOW_ROAD_SETTINGS, LineColor.YELLOW, LineType.NORMAL);
    @ApiStatus.AvailableSince("1.1.0")
    @Cutout
    public static final RoadWithTwoBevelAngleLines.ImplWithThreeLayerTexture ROAD_WITH_WS_AND_BI_BA_LINE = new RoadWithTwoBevelAngleLines.ImplWithThreeLayerTexture(WHITE_ROAD_SETTINGS, LineColor.WHITE, LineType.NORMAL);
    @ApiStatus.AvailableSince("1.1.0")
    @Cutout
    public static final RoadWithTwoBevelAngleLines.ImplWithThreeLayerTexture ROAD_WITH_YS_AND_BI_BA_LINE = new RoadWithTwoBevelAngleLines.ImplWithThreeLayerTexture(YELLOW_ROAD_SETTINGS, LineColor.YELLOW, LineType.NORMAL);

    /**
     * <h2>直斜混合</h2>
     * 白色直线+斜线。
     */
    @Cutout
    public static final RoadWithStraightAndAngleLine.Impl ROAD_WITH_WHITE_S_BA_LINE = new RoadWithStraightAndAngleLine.Impl(WHITE_ROAD_SETTINGS, LineColor.WHITE, LineType.NORMAL);
    /**
     * 黄色直线+斜线
     */
    @ApiStatus.AvailableSince("0.2.0")
    @Cutout
    public static final RoadWithStraightAndAngleLine.Impl ROAD_WITH_YELLOW_S_BA_LINE = new RoadWithStraightAndAngleLine.Impl(YELLOW_ROAD_SETTINGS, LineColor.YELLOW, LineType.NORMAL);

    /**
     * 白色直线+黄色斜线
     */
    @ApiStatus.AvailableSince("0.2.4")
    @Cutout
    public static final RoadWithStraightAndAngleLine.Impl ROAD_WITH_W_S_Y_BA_LINE = new RoadWithStraightAndAngleLine.Impl(WHITE_ROAD_SETTINGS, LineColor.WHITE, LineColor.YELLOW, LineType.NORMAL, LineType.NORMAL);
    /**
     * 黄色直线+白色斜线
     */
    @ApiStatus.AvailableSince("0.2.4")
    @Cutout
    public static final RoadWithStraightAndAngleLine.Impl ROAD_WITH_Y_S_W_BA_LINE = new RoadWithStraightAndAngleLine.Impl(YELLOW_ROAD_SETTINGS, LineColor.YELLOW, LineColor.WHITE, LineType.NORMAL, LineType.NORMAL);
    /**
     * 白色粗线+斜线
     */
    @ApiStatus.AvailableSince("0.2.4")
    @Cutout
    public static final RoadWithStraightAndAngleLine.Impl ROAD_WITH_WT_S_N_BA_LINE = new RoadWithStraightAndAngleLine.Impl(WHITE_ROAD_SETTINGS, LineColor.WHITE, LineColor.WHITE, LineType.THICK, LineType.NORMAL);
    /**
     * 黄色粗线+斜线
     */
    @ApiStatus.AvailableSince("0.2.4")
    @Cutout
    public static final RoadWithStraightAndAngleLine.Impl ROAD_WITH_YT_S_N_BA_LINE = new RoadWithStraightAndAngleLine.Impl(YELLOW_ROAD_SETTINGS, LineColor.YELLOW, LineColor.YELLOW, LineType.THICK, LineType.NORMAL);
    /**
     * 白色粗线+黄色斜线
     */
    @ApiStatus.AvailableSince("0.2.4")
    @Cutout
    public static final RoadWithStraightAndAngleLine.Impl ROAD_WITH_WT_S_YN_BA_LINE = new RoadWithStraightAndAngleLine.Impl(WHITE_ROAD_SETTINGS, LineColor.WHITE, LineColor.YELLOW, LineType.THICK, LineType.NORMAL);
    /**
     * 黄色粗线+白色斜线
     */
    @ApiStatus.AvailableSince("0.2.4")
    @Cutout
    public static final RoadWithStraightAndAngleLine.Impl ROAD_WITH_YT_S_WN_BA_LINE = new RoadWithStraightAndAngleLine.Impl(YELLOW_ROAD_SETTINGS, LineColor.YELLOW, LineColor.WHITE, LineType.THICK, LineType.NORMAL);
    /**
     * <h2>十字交叉</h2>
     * 白色十字交叉线。
     */
    @Cutout
    public static final RoadWithCrossLine.Impl ROAD_WITH_WHITE_CROSS_LINE =
            new RoadWithCrossLine.Impl(WHITE_ROAD_SETTINGS, LineColor.WHITE);
    /**
     * 白色细十字交叉线。
     */
    @Cutout
    public static final RoadWithCrossLine.Impl ROAD_WITH_WHITE_CROSS_THIN_LINE =
            new RoadWithCrossLine.Impl(WHITE_ROAD_SETTINGS, LineColor.WHITE, LineType.THIN);

    /**
     * 白色出租车十字交叉线。
     */
    @Cutout
    public static final RoadWithCrossLine.Impl ROAD_WITH_WHITE_CROSS_TAXI_LINE =
            new RoadWithCrossLine.Impl(WHITE_ROAD_SETTINGS, LineColor.WHITE, LineType.TAXI);
    /**
     * 黄色十字交叉线。
     */
    @ApiStatus.AvailableSince("0.2.0")
    @Cutout
    public static final RoadWithCrossLine.Impl ROAD_WITH_YELLOW_CROSS_LINE = new RoadWithCrossLine.Impl(YELLOW_ROAD_SETTINGS, LineColor.YELLOW);


    /**
     * <h2>自动路块</h2>
     * <p>
     * 斜线自动路块。放置后遇到方块更新会自动确定线路走向。
     */
    @Cutout
    public static final RoadBlockWithAutoLine ROAD_WITH_WHITE_AUTO_BA_LINE = new RoadBlockWithAutoLine(WHITE_ROAD_SETTINGS, RoadWithAutoLine.RoadAutoLineType.BEVEL, "white_auto_bevel_angle_line");
    /**
     * 直角自动路块。
     */
    @Cutout
    public static final RoadBlockWithAutoLine ROAD_WITH_WHITE_AUTO_RA_LINE = new RoadBlockWithAutoLine(WHITE_ROAD_SETTINGS, RoadWithAutoLine.RoadAutoLineType.RIGHT_ANGLE, "white_auto_right_angle_line");
    /**
     * <h2>其他</h2>
     * <p>
     * 填满的路块。
     */
    public static final RoadBlock ROAD_FILLED_WITH_WHITE = new RoadBlock(WHITE_ROAD_SETTINGS, MishangucModels.texture("white_ink"), LineColor.WHITE);

    public static final RoadBlock ROAD_FILLED_WITH_YELLOW = new RoadBlock(YELLOW_ROAD_SETTINGS, MishangucModels.texture("yellow_ink"), LineColor.YELLOW);

    public static @NotNull AbstractRoadBlock getRoadBlockWithLine(LineColor lineColor, LineType lineType) {
        return switch (lineColor) {
            case WHITE -> switch (lineType) {
                case NORMAL -> ROAD_WITH_WHITE_LINE;
                case DOUBLE -> ROAD_WITH_WHITE_DOUBLE_LINE;
                case THICK -> ROAD_WITH_WHITE_THICK_LINE;
                case EDGE -> ROAD_WITH_WHITE_EDGE_LINE;
                case THIN -> ROAD_WITH_WHITE_THIN_LINE;
                case TAXI -> ROAD_WITH_WHITE_TAXI_LINE;
                case ACCESS -> ROAD_WITH_WHITE_OFFSET_ACCESS_LINE;
                case SPECIAL -> ROAD_WITH_WHITE_BUS_LINE;
                default -> throw new UnsupportedOperationException(
                        String.format("Cannot determine white block with [type=%s]", lineType.asString())
                );
            };
            case YELLOW -> switch (lineType) {
                case NORMAL -> ROAD_WITH_YELLOW_LINE;
                case DOUBLE -> ROAD_WITH_YELLOW_DOUBLE_LINE;
                case THICK -> ROAD_WITH_YELLOW_THICK_LINE;
                case EDGE -> ROAD_WITH_YELLOW_EDGE_LINE;
                default -> throw new UnsupportedOperationException(
                        String.format("Cannot determine yellow block with [type=%s]", lineType.asString())
                );
            };
            case ORANGE -> switch (lineType) {
                case NORMAL -> ROAD_WITH_ORANGE_LINE;
                case DOUBLE -> ROAD_WITH_YELLOW_DOUBLE_LINE;
                case THICK -> ROAD_WITH_YELLOW_THICK_LINE;
                case EDGE -> ROAD_WITH_YELLOW_EDGE_LINE;
                default -> throw new UnsupportedOperationException(
                        String.format("Cannot determine yellow block with [type=%s]", lineType.asString())
                );
            };
            case RED -> switch (lineType) {
                case NORMAL -> ROAD_WITH_YELLOW_LINE;
                case DOUBLE -> ROAD_WITH_YELLOW_DOUBLE_LINE;
                case THICK -> ROAD_WITH_RED_THICK_LINE;
                case EDGE -> ROAD_WITH_YELLOW_EDGE_LINE;
                default -> throw new UnsupportedOperationException(
                        String.format("Cannot determine yellow block with [type=%s]", lineType.asString())
                );
            };
            default -> throw new UnsupportedOperationException(String.format("Cannot determine base block with [color=%s, type=%s]", lineColor.asString(), lineType.asString()));
        };
    }
}