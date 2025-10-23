


@Composable
fun AktivitasPertama(modifier: Modifier) {
    Column(
        modifier = Modifier.padding(top = 100.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(id = R.string.prodi),
            fontSize = 35.sp,
            fontWeight = FontWeight.Bold
        )

