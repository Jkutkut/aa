/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   ft_strupcase.c                                     :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: jre-gonz <jre-gonz@student.42madrid.com>   +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2022/01/18 11:22:32 by jre-gonz          #+#    #+#             */
/*   Updated: 2022/01/18 11:22:38 by jre-gonz         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

#include <unistd.h>

#define MIN_LO 'a'
#define	MAX_LO 'z'

int	is_lower(char c)
{
	return (c >= MIN_LO && c <= MAX_LO);
}

char	*ft_strupcase(char *str)
{
	int	i;

	i = 0;
	while (str[i] != '\0')
	{
		if (is_lower(str[i]))
			str[i] -= 32;
		i++;
	}
	return (str);
}
