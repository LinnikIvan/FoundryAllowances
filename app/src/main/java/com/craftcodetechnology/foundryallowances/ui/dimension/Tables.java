package com.craftcodetechnology.foundryallowances.ui.dimension;

public class Tables {
    public static final String[] DCTG_GOST_26645 = {"1", "2", "3т", "3", "4", "5т", "5",
            "6", "7т", "7", "8", "9т", "9", "10", "11т", "11", "12", "13т", "13", "14", "15", "16"};

    public static final Float[][] DIMENSION_TABLE_GOST_26645 = {
            {0.06f, 0.08f, 0.10f, 0.12f, 0.16f, 0.20f, 0.24f, 0.32f, 0.40f, 0.50f, 0.64f, 0.8f, 1.0f, 1.2f, 1.6f, 2.0f, null, null, null, null, null, null},
            {0.07f, 0.09f, 0.11f, 0.14f, 0.18f, 0.22f, 0.28f, 0.36f, 0.44f, 0.56f, 0.70f, 0.9f, 1.1f, 1.4f, 1.8f, 2.2f, 2.8f, null, null, null, null, null},
            {0.08f, 0.10f, 0.12f, 0.16f, 0.20f, 0.24f, 0.32f, 0.40f, 0.50f, 0.64f, 0.80f, 1.0f, 1.2f, 1.6f, 2.0f, 2.4f, 3.2f, 4.0f, 5.0f, null, null, null},
            {0.09f, 0.11f, 0.14f, 0.18f, 0.22f, 0.28f, 0.36f, 0.44f, 0.56f, 0.70f, 0.90f, 1.1f, 1.4f, 1.8f, 2.2f, 2.8f, 3.6f, 4.4f, 5.6f, 7.0f, null, null},
            {0.10f, 0.12f, 0.16f, 0.20f, 0.24f, 0.32f, 0.40f, 0.50f, 0.64f, 0.80f, 1.00f, 1.2f, 1.6f, 2.0f, 2.4f, 3.2f, 4.0f, 5.0f, 6.4f, 8.0f,  10f,  12f},
            {0.11f, 0.14f, 0.18f, 0.22f, 0.28f, 0.36f, 0.44f, 0.56f, 0.70f, 0.90f, 1.10f, 1.4f, 1.8f, 2.2f, 2.8f, 3.6f, 4.4f, 5.6f, 7.0f, 9.0f,  11f,  14f},
            {0.12f, 0.16f, 0.20f, 0.24f, 0.32f, 0.40f, 0.50f, 0.64f, 0.80f, 1.00f, 1.20f, 1.6f, 2.0f, 2.4f, 3.2f, 4.0f, 5.0f, 6.4f, 8.0f,  10f,  12f,  16f},
            {0.14f, 0.18f, 0.22f, 0.28f, 0.36f, 0.44f, 0.56f, 0.70f, 0.90f, 1.10f, 1.40f, 1.8f, 2.2f, 2.8f, 3.6f, 4.4f, 5.6f, 7.0f, 9.0f,  11f,  14f,  18f},
            {0.16f, 0.20f, 0.24f, 0.32f, 0.40f, 0.50f, 0.64f, 0.80f, 1.00f, 1.20f, 1.60f, 2.0f, 2.4f, 3.2f, 4.0f, 5.0f, 6.4f, 8.0f,  10f,  12f,  16f,  20f},
            {null,  null,  0.28f, 0.36f, 0.44f, 0.56f, 0.70f, 0.90f, 1.10f, 1.40f, 1.80f, 2.2f, 2.8f, 3.6f, 4.4f, 5.6f, 7.0f, 9.0f,  11f,  14f,  18f,  22f},
            {null,  null,  0.32f, 0.40f, 0.50f, 0.64f, 0.80f, 1.00f, 1.20f, 1.60f, 2.00f, 2.4f, 3.2f, 4.0f, 5.0f, 6.4f, 8.0f,  10f,  12f,  16f,  20f,  24f},
            {null,  null,  null,  null,  0.56f, 0.70f, 0.90f, 1.10f, 1.40f, 1.80f, 2.20f, 2.8f, 3.6f, 4.4f, 5.6f, 7.0f, 9.0f,  11f,  14f,  18f,  22f,  28f},
            {null,  null,  null,  null,  null,  0.80f, 1.00f, 1.20f, 1.60f, 2.00f, 2.40f, 3.2f, 4.0f, 5.0f, 6.4f, 8.0f,  10f,  12f,  16f,  20f,  24f,  32f},
            {null,  null,  null,  null,  null,  null,  null,  1.40f, 1.80f, 2.20f, 2.80f, 3.6f, 4.4f, 5.6f, 7.0f, 9.0f,  11f,  14f,  18f,  22f,  28f,  36f},
            {null,  null,  null,  null,  null,  null,  null,  null,  2.00f, 2.40f, 3.20f, 4.0f, 5.0f, 6.4f, 8.0f,  10f,  12f,  16f,  20f,  24f,  32f,  40f},
            {null,  null,  null,  null,  null,  null,  null,  null,  null,  3.20f, 3.60f, 4.4f, 5.6f, 7.0f, 9.0f,  11f,  14f,  18f,  22f,  28f,  36f,  44f},
            {null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  5.0f, 6.4f, 8.0f,  10f,  12f,  16f,  20f,  24f,  32f,  40f,  50f},
            {null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null, 8.0f,  10f,  12f,  16f,  20f,  24f,  32f,  40f,  50f,  64f},
            {null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null, null,  12f,  16f,  20f,  24f,  32f,  40f,  50f,  64f,  80f}};

    public static final String[] DCTG_ISO_8062 = {"1", "2", "3", "4", "5", "6", "7", "8",
            "9", "10", "11", "12", "13", "14", "15", "16"};

    public static final Float[][] TABLE_ISO_8062 = new Float[][]{
            {0.09f, 0.13f, 0.18f, 0.26f, 0.36f, 0.52f, 0.74f, 1.0f, 2.0f, 2.0f, 2.8f, 4.2f, null, null, null, null},
            {0.10f, 0.14f, 0.20f, 0.28f, 0.38f, 0.54f, 0.78f, 1.1f, 1.6f, 2.2f, 3.0f, 4.4f, null, null, null, null},
            {0.11f, 0.15f, 0.22f, 0.30f, 0.42f, 0.58f, 0.82f, 1.2f, 1.7f, 2.4f, 3.2f, 4.6f,   6f,   8f,  10f,  12f},
            {0.12f, 0.17f, 0.24f, 0.32f, 0.46f, 0.64f, 0.90f, 1.3f, 1.8f, 2.6f, 3.6f, 5.0f,   7f,   9f,  11f,  14f},
            {0.13f, 0.18f, 0.26f, 0.36f, 0.50f, 0.70f, 1.00f, 1.4f, 2.0f, 2.8f, 4.0f, 5.6f,   8f,  10f,  12f,  16f},
            {0.14f, 0.20f, 0.28f, 0.40f, 0.56f, 0.78f, 1.10f, 1.6f, 2.2f, 3.2f, 4.4f, 6.0f,   9f,  11f,  14f,  18f},
            {0.15f, 0.22f, 0.30f, 0.44f, 0.62f, 0.88f, 1.20f, 1.8f, 2.5f, 3.6f, 5.0f, 7.0f,  10f,  12f,  16f,  20f},
            {null,  0.24f, 0.34f, 0.50f, 0.70f, 1.00f, 1.40f, 2.0f, 2.8f, 4.0f, 5.6f, 8.0f,  11f,  14f,  18f,  22f},
            {null,  null,  0.40f, 0.56f, 0.78f, 1.10f, 1.60f, 2.2f, 3.2f, 4.4f, 6.2f, 9.0f,  12f,  16f,  20f,  25f},
            {null,  null,  null,  0.64f, 0.90f, 1.20f, 1.80f, 2.6f, 3.6f, 5.0f, 7.0f,  10f,  14f,  18f,  22f,  28f},
            {null,  null,  null,  null,  1.00f, 1.40f, 2.00f, 2.8f, 4.0f, 6.0f, 8.0f,  11f,  16f,  20f,  25f,  32f},
            {null,  null,  null,  null,  null,  1.60f, 2.20f, 3.2f, 4.6f, 7.0f, 9.0f,  13f,  18f,  23f,  29f,  37f},
            {null,  null,  null,  null,  null,  null,  2.60f, 3.8f, 5.4f, 8.0f,  10f,  15f,  21f,  26f,  33f,  42f},
            {null,  null,  null,  null,  null,  null,  null,  4.0f, 6.2f, 9.0f,  12f,  17f,  24f,  30f,  38f,  49f},
            {null,  null,  null,  null,  null,  null,  null,  null, 7.0f,  10f,  14f,  20f,  28f,  35f,  44f,  56f},
            {null,  null,  null,  null,  null,  null,  null,  null, null,  11f,  16f,  23f,  32f,  40f,  50f,  64f}};

}