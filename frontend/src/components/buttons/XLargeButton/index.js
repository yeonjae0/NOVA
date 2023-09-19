import React from 'react';
import { Dimensions, View, Text } from 'react-native';
import * as S from './style'

const { height } = Dimensions.get('window');

// 랭킹페이지용
// 버튼 이름, 눌릴 때 함수, 배경색 넣기
const Button = props => {
    console.log(props)
    return (
        <S.ButtonContainer onPress={props.onPress}
            pressRetentionOffset={{ bottom: 10, top: 10, left: 10, right: 10 }}
            bgColor= {props.bgColor}
            height={height}
            >
            <View>
                <Text style={{ fontSize: 20, color: "black" }}>{props.title}</Text>
            </View>
        </S.ButtonContainer>
    )
}

export default Button;